package eval.ups.buisness;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import eval.ups.model.Persona;
import eval.ups.dao.PersonaDAO;

@Path("/persona")
public class GestionPersonas {


    @Inject
    private PersonaDAO personaDAO;

    @Path("/get")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Persona> getPersonas() {
        return personaDAO.getAll();
    }

    @Path("/get/{cedula}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Persona getPersona(@PathParam("cedula") String cedula) {
        return personaDAO.get(cedula);
    }

    @Path("/delete/{cedula}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String deletePersona(@PathParam("cedula") String cedula) {
        personaDAO.delete(cedula);
        return "Persona eliminada";
    }

    @Path("/create")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String createPersona(Persona persona) {
        personaDAO.create(persona);
        return "Persona creada";
    }

    @Path("/update")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updatePersona(Persona persona) {
        personaDAO.update(persona);
        return Response.ok("Persona actualizada").build();
    }
}
