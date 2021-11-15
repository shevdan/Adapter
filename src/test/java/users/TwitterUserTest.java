package users;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TwitterUserTest {
    private TwitterUser user = new TwitterUser();

    @org.junit.jupiter.api.Test
    void getUserMail(){
        assertEquals(user.getUserMail(), "twitter@twi.com");
    }

    @org.junit.jupiter.api.Test
    void getCountry(){
        assertEquals(user.getCountry(), "USA");
    }

    @org.junit.jupiter.api.Test
    void getLastActiveTime(){
        assertEquals(user.getLastActiveTime(),
                new Date(2021, 12, 12, 12, 12, 12));
    }

}