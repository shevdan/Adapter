package users;

import java.util.Date;

public class FacebookUser extends User{

    public FacebookUser(){
        setCountry("USA");
        setUserMail("Meta@meta.com");
        setLastActiveTime(
                new Date(2021, 12, 12, 12, 12, 12)
        );
    }
    public FacebookUser(String country, String mail, Date time){
        setCountry(country);
        setUserMail(mail);
        setLastActiveTime(time);
    }
}
