package org.koushik.javabrains.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jacek on 05.09.15.
 */

@XmlRootElement
public class Message {

    private long id;
    private String message;
    private Date created;
    private String author;
    private Map<Long, Comment> comments =  new HashMap<>();

    public Message(){

    }

    public Message(long id, String message, String author) {
        this.author = author;
        this.message = message;
        this.id = id;
        this.created = new Date();
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getCreated() {
        return created;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @XmlTransient

    public Map<Long, Comment> getComments() {
        return comments;
    }

    public void setComments(Map<Long, Comment> comments) {
        this.comments = comments;
    }
}