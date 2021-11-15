package users;

import java.util.Date;

public class TwitterUser extends User{

    public TwitterUser(){
        setCountry("USA");
        setUserMail("twitter@twi.com");
        setLastActiveTime(
                new Date(2021, 12, 12, 12, 12, 12)
        );
    }
    public TwitterUser(String country, String mail, Date time){
        setCountry(country);
        setUserMail(mail);
        setLastActiveTime(time);
    }
}