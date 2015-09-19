package org.koushik.javabrains.messenger.resources;

        import javax.ws.rs.*;
        import javax.ws.rs.core.Context;
        import javax.ws.rs.core.HttpHeaders;
        import javax.ws.rs.core.MediaType;
        import javax.ws.rs.core.UriInfo;

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

    @GET
    @Path("context")
    public String getParamsUsingContext(@Context UriInfo uriInfo, @Context HttpHeaders headers ){
        String path = uriInfo.getAbsolutePath().toString();
        String cookies = headers.getCookies().toString();
        return "Path : " + path + "\nCookies = " + cookies;
    }
}
