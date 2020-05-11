package Erzeugungsmuster.builder.userExample;

import java.util.Date;

public class User {

    private String name;
    private Date birthday;
    private String email;

    User(String name) {
        this.name = name;
    }

    public void setEmail(String email){

        this.email = email;

    }

    public void setBirthday(Date birthday){


        this.birthday = birthday;

    }
}
