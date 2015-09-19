package org.koushik.javabrains.messenger.resources;

import org.koushik.javabrains.messenger.model.Comment;
import org.koushik.javabrains.messenger.service.CommentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by jacek on 19.09.15.
 */

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentResource {

    private CommentService commentService = new CommentService();

    @GET
    public List<Comment> getAllComments(@PathParam("messageId") long messageId){
        return commentService.getAllComments(messageId);
    }

    @POST
    public Comment addMessage(@PathParam("messageId") long messageId, Comment comment){
        return commentService.addComent(messageId, comment);
    }

    @PUT
    @Path("/{commentId}")
    public Comment updateMessage(@PathParam("messageId") long messageId, @PathParam("commentId") long id, Comment comment){
        comment.setId(id);
        return commentService.updateComment(messageId, comment);
    }

    @DELETE
    @Path("/{commentId}")
    public void addMessage(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId){
        commentService.removeComment(messageId, commentId);
    }

    @GET
    @Path("/{commentId}")
    public Comment getMessage(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId){
        return commentService.getComment(messageId, commentId);
    }
}