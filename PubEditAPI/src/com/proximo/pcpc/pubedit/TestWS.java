package com.proximo.pcpc.pubedit;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.proximo.pcpc.pubedit.dao.Pubedit;
import com.proximo.pcpc.pubedit.dao.PubeditDAO;
import com.proximo.pcpc.pubedit.model.Result;

/**
 *  
 * @author dumitrugutu
 * root resource
 *
 */
@Path("/testws")
public class TestWS {
	
	static final Logger logger = Logger.getLogger(TestWS.class);
	
	Pubedit pubeditApi = new PubeditDAO();

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String currentDate() {
		Date dt = Calendar.getInstance().getTime();
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
		return df.format(dt);
	}
	
	@GET
	@Path("/noroc")
	@Produces(MediaType.TEXT_PLAIN)
	public String getTables() {
		return "noroc";
	}
	
	@GET
	@Path("data_type={data_type}/action={action}/data={data}")
	@Produces(MediaType.TEXT_PLAIN)
	public String submit(@PathParam ("data_type") String dataType, @PathParam ("action") String action, @PathParam ("data") String data) {
		return "dataType=" + dataType + "; action=" + action + "; data=" + data;
	}
	
	@GET
	@Path("{data_type}/{action}/{data}")
	@Produces(MediaType.TEXT_PLAIN)
	public String submit2(@PathParam ("data_type") String dataType, @PathParam ("action") String action, @PathParam ("data") String data) {
		return "dataType=" + dataType + "; action=" + action + "; data=" + data;
	}
	
	
	@GET
	@Path("query")
	@Produces(MediaType.TEXT_PLAIN)	
	public String submit3(
			@QueryParam ("data_type") String dataType, 
			@QueryParam ("action") String action, 
			@QueryParam ("data") String data) {

		logger.debug("data_type="+ dataType);
		logger.debug("action="+action);
		logger.debug("data="+data);
		
		return "dataType=" + dataType + "; action=" + action + "; data=" + data;
	}
	
	@GET
	@Path("validate")
	@Produces(MediaType.TEXT_PLAIN) 
	public String validateUserToken(@QueryParam("token") String userToken) {
		
		Result result = pubeditApi.isTokenValid(userToken);
		
		if (result.isUserValid())
			return "user token=" + userToken + " is valid !";
		else
			return "user token=" + userToken + " is invalid !";
	}
	
	@GET
	@Path("process")
	@Produces(MediaType.APPLICATION_JSON) 
	public Result process(
				@QueryParam("token") String userToken,
				@QueryParam ("data_type") String dataType, 
				@QueryParam ("action") String action, 
				@QueryParam ("data") String data) {
		
		Result result = pubeditApi.isTokenValid(userToken);
		
		if (!result.isUserValid()) {
			return result;
		}
		else {
			return pubeditApi.processApiData(userToken, dataType, action, data);
		}
	}
	
}
