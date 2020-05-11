package Erzeugungsmuster.builder.userExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserBuilder
{
        private String name ="Robert";
        private String email = name + "test@test.com";
        private Date birthday;


        public UserBuilder withName(String name){

                this.name = name;
                return this;

        }

        public UserBuilder withEmail(String email){

                this.email = email;
                return this;
        }

        public UserBuilder withBirthday(String ddMMyyyy) throws Exception{
                this.birthday = new SimpleDateFormat("dd.MM.yyyy").parse(ddMMyyyy);
                return this;
        }

        public User build(){
                User user = new User(name);
                user.setEmail(email);
                user.setBirthday(birthday);
                return user;
        }

        public static void main(String[] args){

                User user = new UserBuilder().withName("robert").withEmail("asd@asd.de").build();
        }

}

