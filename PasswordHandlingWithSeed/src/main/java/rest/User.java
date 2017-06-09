package rest;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("demouser")
@RolesAllowed("User")
public class User {
  
 //  @GET
//  @Produces(MediaType.APPLICATION_JSON)
//  public String getSomething(){
//    return "{\"message\" : \"Hello User from Server (Accesible by only authenticated USERS)\"}"; 
//  }
  
    @GET
    @Path("demouser")
    @Produces(MediaType.APPLICATION_JSON)
    public String getSomething(){
        return "{\"message\" : \"Hello User from Server (Accesible by only authenticated USERS)\"}"; 
    }
  
    @Path("footballclubs")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getClubs(){
//      String str = "[{\"name\":\"Liverpool\", \"url\":\"http://www.liverpoolfc.com\"},{\"name\":\"Manchester United\",\"url\" : \"http://www.manutd.com/\"}]";
//      String str = "{\"name\":\"Liverpool\", \"url\":\"http://www.liverpoolfc.com\"}";
//      String str = "{\"message\" : \"myMessage\", \"name\":\"Liverpool\", \"url\":\"http://www.liverpoolfc.com\"}";
//String str = "Hello!";
//    return str; 
        return "[{\"name\":\"Liverpool\", \"url\":\"http://www.liverpoolfc.com\"},{\"name\":\"Manchester United\",\"url\" : \"http://www.manutd.com/\"}]"; 
//        return "{\"message\" : \"Hello User from Server (Accesible by only authenticated USERS)\"}"; 
    }
//  @GET
//  @Path("footballclubs")
//  @Produces(MediaType.APPLICATION_JSON)
//  public String getNewSomething(){
//    String str = "[{\"name\":\"Liverpool\", \"url\":\"http://www.liverpoolfc.com\"},\n" +
//" {\"name\":\"Manchester United\",\"url\" : \"http://www.manutd.com/\"}]";
//    return str; 
//  }
 
}