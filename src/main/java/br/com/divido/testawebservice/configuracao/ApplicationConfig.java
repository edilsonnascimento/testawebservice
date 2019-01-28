package br.com.divido.testawebservice.configuracao;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author edilson
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.com.divido.testawebservice.resource.EnderecoResource.class);
        resources.add(br.com.divido.testawebservice.resource.UsuarioResource.class);
    }

}
