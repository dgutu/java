package com.gda.newsi.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class UserService {

	@Value("${api.user.url}")
	private String apiUrl;

	private OkHttpClient httpClient;

	public UserService() {
		setHttpClient(new OkHttpClient());
	}

	public boolean signIn(String userName, String password) throws IOException {

		String apiCall = apiUrl + "signIn/" + userName + "/" + password;

		Request request = new Request.Builder().url(apiCall).get().build();
		Response response = httpClient.newCall(request).execute();

		return response.isSuccessful();
	}

	public OkHttpClient getHttpClient() {
		return httpClient;
	}

	public void setHttpClient(OkHttpClient httpClient) {
		this.httpClient = httpClient;
	}

}
