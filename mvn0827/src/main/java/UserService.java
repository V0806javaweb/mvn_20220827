import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.User;

@Path("/user")
public class UserService {
//this is a class
	    @POST
	    @Path("/post")
	    @Consumes(MediaType.APPLICATION_JSON)
	    public Response postStudentRecord(User  cst){
	        String result = "Record entered: "+ cst;
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mvn0827");
	        EntityManager em = emf.createEntityManager();
	        em.getTransaction().begin();
	        em.persist(cst);
	        em.getTransaction().commit();
	        em.close();
	        emf.close();
	        return Response.ok().entity(result).build();
	    }

}
