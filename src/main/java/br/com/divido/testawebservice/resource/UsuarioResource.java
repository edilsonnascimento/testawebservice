package br.com.divido.testawebservice.resource;

import br.com.divido.testawebservice.dao.UsuarioDAO;
import br.com.divido.testawebservice.model.Usuario;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author edilson
 */
@Path("usuario")
@Produces({MediaType.APPLICATION_JSON})
public class UsuarioResource {

    @Inject
    private UsuarioDAO usuarioDao;

    public UsuarioResource() {
    }

    @GET
    public List<Usuario> getTodosUsuarios() {
        return usuarioDao.buscaTodosUsuarios();
    }

    @GET
    @Path("{id}")
    public Usuario getUsuario(@PathParam("id") Integer id) {
        return usuarioDao.buscaUsuario(id);
    }

    @PUT
    public void putUsuario(Usuario usuario) {
        usuarioDao.salvar(usuario);
    }
}
