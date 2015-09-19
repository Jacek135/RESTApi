package org.koushik.javabrains.messenger.database;

import org.koushik.javabrains.messenger.model.Message;
import org.koushik.javabrains.messenger.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jacek on 06.09.15.
 */
public class DatabaseClass {

    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessages(){
        return messages;
    }

    public static Map<String, Profile> getProfiles(){
        return profiles;
    }
}
