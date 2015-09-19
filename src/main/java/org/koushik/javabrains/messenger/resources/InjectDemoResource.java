package org.koushik.javabrains.messenger.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by jacek on 19.09.15.
 */
@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {

    @GET
    @Path("annotations")
    public String etParamsUsingAnnotations(@MatrixParam("param")String matrixParam,
                                           @HeaderParam("ala") String header,
                                           @CookieParam("JSESSIONID") String cookie){
    return "Matrix param: " + matrixParam + "; Header Value = " + header + "; Cookie = " + cookie;
}

}
