package sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.FacebookUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    MessageSender sender = new MessageSender(new Date(12, 12, 12, 12, 12, 12));
    FacebookUser user;

    @BeforeEach
    void setUp() {
        user = new FacebookUser();
    }

    @Test
    void send() {
        assertTrue(sender.send("hello", user, "USA"));
    }
}