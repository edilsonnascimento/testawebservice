package br.com.divido.testawebservice.dao;

import br.com.divido.testawebservice.model.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ednascimento
 */
@Stateless
public class UsuarioDAO {

    @PersistenceContext
    private EntityManager manager;

    public void salvar(Usuario usuario) {
        manager.persist(usuario);
    }

    public List<Usuario> buscaTodosUsuarios() {
        return manager.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
    }

    public Usuario buscaUsuario(Integer id) {
        return manager.find(Usuario.class, id);
    }
}
