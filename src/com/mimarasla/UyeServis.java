package com.mimarasla;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

//http://localhost:8080/_003_RestfulAnnotation/rest/uye/giris
@Path(value="/uye")
public class UyeServis {

	@POST
	@Path(value="/giris")
	@Produces("text/html;charset=utf-8")
	public Response girisYap(@FormParam("kullaniciAdi") String kullaniciAdi) {
		System.out.println("formdan gelen parametre"+kullaniciAdi);
		String sonuc="<h1>"+kullaniciAdi+"<h1>";
		return Response.status(200).entity(sonuc).build();
		
	}
}
