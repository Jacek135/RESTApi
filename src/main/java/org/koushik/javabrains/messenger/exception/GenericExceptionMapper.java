package org.koushik.javabrains.messenger.exception;

import org.koushik.javabrains.messenger.model.ErrorMessage;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by jacek on 22.09.15.
 */
    @Provider
    public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

        @Override
        public Response toResponse(Throwable exception) {
            ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 500, "www.onet.pl");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(errorMessage)
                    .build();
        }
}
