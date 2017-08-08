package com.gda.newsi;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.gda.newsi.domain.User;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewSiuiApplicationTests {

	@Value("${api.user.url}")
	private String apiUrl;

	@Test
	public void restClientOkHttp() {
		String apiURL = apiUrl + "signIn/admin5/Password123_";

		OkHttpClient okHttpClient = new OkHttpClient();

		Request request = new Request.Builder().url(apiURL).get().build();
		try {
			Response response = okHttpClient.newCall(request).execute();
			System.out.println(response.body().string());
			System.out.println(response.code());
			System.out.println(response.isSuccessful());

			assertTrue(response.isSuccessful());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	@Test
	public void restTemplateClient() {

		RestTemplate restTemplate = new RestTemplate();
		String signInURL = apiUrl + "signIn/{login}/{password}";

		Map<String, String> params = new HashMap<String, String>();
		params.put("login", "admin5");
		params.put("password", "Password123_");

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Object> entity = new HttpEntity<Object>(headers);

		try {
			ResponseEntity<User> out = restTemplate.exchange(signInURL, HttpMethod.GET, entity, User.class, params);
			System.out.println(out.getBody().getUserId());
			System.out.println(out.getStatusCode());

			assertTrue(out.getBody().getLogin().equals("admin5"));

		} catch (HttpStatusCodeException e) {
			System.out.println(e.getStatusCode());
			System.out.println(e.getResponseBodyAsString());
		}
	}

}
