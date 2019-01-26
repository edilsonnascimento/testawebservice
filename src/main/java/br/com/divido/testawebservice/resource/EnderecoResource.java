package br.com.divido.testawebservice.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author edilson
 */
@Path("endereco")
public class EnderecoResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String endereco(){
        return "AVENIDA SETE DE SETEMBRO 200";
    }
    
}
