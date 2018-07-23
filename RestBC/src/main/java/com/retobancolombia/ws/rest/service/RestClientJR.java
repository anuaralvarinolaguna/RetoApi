package com.retobancolombia.ws.rest.service;


import com.retobancolombia.ws.rest.vo.VOUsuario;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import com.sun.jersey.api.json.JSONConfiguration;

public class RestClientJR {
	
	public static void main(String[] args) {
		String urlRestService = "http://localhost:8080/RestJR/restJR/JavaRevolutions/validaUsuario";
		System.out.println("######## Invoke Rest Service: ["+urlRestService+"]");
		VOUsuario vo = new VOUsuario();
		vo.setUsuario("Java");
		vo.setPassword("Revolutions");
		vo.setUserValido(false);
		
		ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);
        WebResource webResource = client.resource(urlRestService);
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, vo);
        vo = response.getEntity(VOUsuario.class);
        System.out.println("######## Response: [Usuario: "+vo.getUsuario()+"]");
        System.out.println("######## Response: [User is Valid: "+vo.isUserValido()+"]");
	}

}
