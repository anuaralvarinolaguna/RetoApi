package com.retobancolombia.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.retobancolombia.ws.rest.vo.VOEstudiante;

@Path("/retobancolombia")
public class ServiceEstudianteBC {
	
	@POST
    @Path("/validaEstudiante")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public VOEstudiante validaEstudiante(VOEstudiante vo) {
       
        if (vo.getId().equals("id") && vo.getApellido().equals("Alvarino")) {
          
        }
        return vo;
    }
}
