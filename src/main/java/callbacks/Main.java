package callbacks;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        hello("Omar", "Ramirez", null);

        hello("Omar", null, value -> {
            System.out.println("last name not provided for " + value);
        });

        hello2("Omar", null, () -> {
            System.out.println("last name not provided");
        });

    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }

    //Make this in Java
    /*
    function hello(firstName, lastName, callback) {
        console.log(firstName)
        if (lastName) {
            console.log(lastName)
        } else {
            callback()
        }
    }

    //Metodo de uso
    //hello("Omar", null, function() { console.log("last name not provided")})
     */

}
