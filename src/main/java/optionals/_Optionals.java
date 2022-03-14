package optionals;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class _Optionals {

    public static void main(String[] args) {
        Supplier<IllegalStateException> exception = () -> new IllegalStateException("Exception");
        //Object value =
        Consumer<Object> objectConsumer = value -> {
            //logic
            System.out.println(value);
        };
        Optional.ofNullable(null)
                //.orElseGet(() -> "default value")
                //.orElseThrow(exception)
                .ifPresent(
                        //objectConsumer
                        System.out::println
                )
                ;

        String emailToSend = "omar@jgosoftware.com";
        Optional.ofNullable(emailToSend)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to "+email),
                        () -> System.out.println("Cannot send email")
                );

        //System.out.println(value);

    }

}
