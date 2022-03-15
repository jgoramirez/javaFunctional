package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Omar",
                "omar@jgosoftware.com",
                "4421234567",
                LocalDate.of(1992,3,8)
        );

        System.out.println(new CustomerValidatorService().isValid(customer));

        //If valid, we can store customer

        //Combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

    }

}
