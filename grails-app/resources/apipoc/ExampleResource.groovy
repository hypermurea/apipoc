package apipoc

import com.wordnik.swagger.annotations.*

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.WebApplicationException

@Path('/api/example')
@Api(value = "/api/example", description = "This is an example description")
class ExampleResource {

    @GET
    @Path("/{petId}")
    @ApiOperation(value = "Find pet by ID", notes = "More notes about this method", response = String.class)
    public String getPetById() throws WebApplicationException {
        'foo'
    }
}
