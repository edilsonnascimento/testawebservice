package br.com.divido.testawebservice.dao;

import br.com.divido.testawebservice.model.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ednascimento
 */
public class UsuarioDAO {

    @PersistenceContext
    private EntityManager manager;

    public void salvar(Usuario usuario) {
        manager.persist(usuario);
    }

}
