package com.mimarasla;
 
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
//http://localhost:8080/_001_Restfuljersey1/rest/selam
@Path(value = "/db")
public class merkez {
   //http://localhost:8080/_001_Restfuljersey1/rest/db/ekle
   @GET
   @Path(value = "/ekle")
	public String method1() {
		
		return "eklendi";
	}
 //http://localhost:8080/_001_Restfuljersey1/rest/selam/sorgu2
   @GET
   @Path(value = "/sil")
   @Produces(MediaType.TEXT_PLAIN)
   public String method2() {
	   return "silindi";
	}
   //http://localhost:8080/_001_Restfuljersey1/rest/selam/sorgu3
   @GET
   @Path(value = "/guncelle")
   @Produces("text/html")
   public String method3() {
	   return " Guncellendi";
	}
   //http://localhost:8080/_001_Restfuljersey1/rest/selam/sorgu3/{benimParametrem}
   @GET
   @Path(value = "/sorgu3/{benimParametrem}")//
   @Produces(MediaType.TEXT_XML)
   public Response method4(@PathParam ("benimParametrem") String benimParametrem)//1. parametre yukaýda
   //gelen 2. string parametresine gelecek
   {
	    System.out.println("gelen parametre:"+benimParametrem);
	
		String sonuc="<?xml version=\"1.0\"?><mesaj>"+benimParametrem+"</mesaj>";
		return Response.status(200).entity(sonuc).build();
	}
   //http://localhost:8080/_003_Restfuljersey1/rest/db/sorgu4/p1/p2
 
   
}
