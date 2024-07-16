package eval.ups.eval;

import java.util.HashSet;
import java.util.Set;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import eval.ups.buisness.GestionPersonas; 

@ApplicationPath("/rs/")
public class DemoApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        resources.add(CORSFilter.class); // Registra el filtro CORS si es necesario
        resources.add(GestionPersonas.class); 
        return resources;
    }
}
