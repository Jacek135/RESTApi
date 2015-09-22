package org.koushik.javabrains.messenger.exception;

import org.koushik.javabrains.messenger.model.ErrorMessage;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by jacek on 22.09.15.
 */
@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

    @Override
    public Response toResponse(DataNotFoundException exception) {
        ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 404, "www.onet.pl");
        return Response.status(Response.Status.NOT_FOUND)
                .entity(errorMessage)
                .build();
    }
}
