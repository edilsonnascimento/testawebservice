package br.com.divido.testawebservice.resource;

import br.com.divido.testawebservice.model.Usuario;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author edilson
 */
@Path("usuario")
public class UsuarioResource {

    @Context
    private UriInfo context;

    public UsuarioResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario getJson() {
        Usuario usuario = new Usuario();
        usuario.setNome("PRIMEIRO USUARIO DO SISTEMA");
        usuario.setIdUsuario(1008574);
        usuario.setDocumentoNacional("6561651516");
        
        return usuario;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("test")
    public String getString(){
        
        return "TESTA REST";
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
