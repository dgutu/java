package com.proximo.pcpc.pubedit;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.proximo.pcpc.pubedit.dao.Pubedit;
import com.proximo.pcpc.pubedit.dao.PubeditDAO;
import com.proximo.pcpc.pubedit.json.JsonParsing;
import com.proximo.pcpc.pubedit.model.Result;

@Path("/ws")
public class WS {
	static final Logger logger = Logger.getLogger(WS.class);

	@GET
	@Path("process")
	@Produces(MediaType.APPLICATION_JSON)
	public Result process(@QueryParam("token") String userToken, @QueryParam("data_type") String dataType,
			@QueryParam("action") String action, @QueryParam("data") String data) {

		Pubedit pubeditApi = new PubeditDAO();
		Result result = pubeditApi.isTokenValid(userToken);

		if (!result.isUserValid()) {
			return result;
		} else {
			return pubeditApi.processApiData(userToken, dataType, action, data);
		}
	}

	@POST
	@Path("tr")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response processTr(Object obj) {
		return Response.status(200).entity(JsonParsing.parse(obj)).build();
	}
}
