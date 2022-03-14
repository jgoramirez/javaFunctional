package combinatorpattern;

import java.time.LocalDate;

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

        

    }

}
