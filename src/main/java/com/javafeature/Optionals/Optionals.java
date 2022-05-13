package com.javafeature.Optionals;

import lombok.Data;

import java.util.Optional;

public class Optionals {

    User user = new User();

    //Nix gewonnen
    void methode(){
        if(user.getUser() != null){

        }
        if(user.getOptionalUser().isPresent()){

        }

        //1. Codebeispiel
        Optional.of("blabla").orElseGet(() -> user.getDefaultString());

        //2. Codebeispiel
        Optional.of("blabl").ifPresent(System.out::println);

        //3. Codebeispiel
        Optional.of("blabl").ifPresentOrElse(
                (value) -> {
                    String output = "value present, value is " +value;
                    System.out.println();
                },
                () -> System.out.println("Value not present")
        );

        //4. Codebeispiel
        Optional.of("12")
                .map(s -> s + "3")
                .map(Integer::parseInt)
                .map(x -> x +2)
                .ifPresent(System.out::println);
        //125 kommt wohl raus

        //5. Codebeispiel
        if(user.getOptionalUser()
                .flatMap(User::getOptionalUser).isPresent()){

        }

        //6a. Codebeispiel
        Optional.of(123)
                .filter(x -> x > 100)
                .ifPresent(System.out::println);
        //123

        Optional.of(123)
                .filter(x -> x < 100)
                .ifPresent(System.out::println);
        //nothing, weil Optional empty ist

    }

    @Data
    public class User{

        User user;
        Optional<User> optionalUser;

        public User(){
            user = new User();
            optionalUser = Optional.of(new User());
        }

        public String getDefaultString(){
            System.out.println("getDefaultString called");
            return "default";
        }
    }
}
