

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

import model.Customer;
import model.CustomerDataService;

@Path("/customers")
public class CustomerRestService {
    private CustomerDataService dataService = CustomerDataService.getInstance();

    @GET
    @Path("/one")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getOneCustomer() {
    	Customer c1=new Customer("100","Amy","Taipei","23826015");
        return c1;
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postStudentRecord(Customer  cst){
        String result = "Record entered: "+ cst;
        return Response.ok().entity(result).build();
    }

}
