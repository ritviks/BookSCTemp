package Model;

import java.sql.Timestamp;

/**
 * Created by Ritvik on 11/14/15.
 */
public class Chat {

    public final String message;
    public final User fromUser;
    public final User toUser;

    // the time stamp
    public final long timeStamp = System.currentTimeMillis();

    // Constructor
    public Chat(String message, User from, User to) {
        this.message = message;
        this.fromUser = from;
        this.toUser = to;
    }

}
