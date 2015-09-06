package org.koushik.javabrains.messenger.service;

import org.koushik.javabrains.messenger.database.DatabaseClass;
import org.koushik.javabrains.messenger.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by jacek on 05.09.15.
 */
public class MessageService {

    private Map<Long, Message> messages = DatabaseClass.getMessages();

    public List<Message> getAllMessages(){
    Message m1 = new Message(1L, "Hello World!", "Koushik");
    Message m2 = new Message(2L, "Hello Krakow!", "Jacek");

        List<Message> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);

        return list;
    }
}
