package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "5555555555");

        //Normal java function
        greetCostumer(maria);

        greetCostumerV2(maria, false);

        // Consumer Functional interface
        greetCustomerConsumer.accept(maria);

        greetCustomerConsumerV2.accept(maria, false);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello "+customer.customerName+
                    ", thanks for registering phone number "
                    +(showPhoneNumber ? customer.customerPhoneNumber:"**********"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "+customer.customerName+
                    ", thanks for registering phone number "
                    +customer.customerPhoneNumber);

    static void greetCostumer(Customer customer) {
        System.out.println("Hello "+customer.customerName+
                ", thanks for registering phone number "
                +customer.customerPhoneNumber);
    }

    static void greetCostumerV2(Customer customer, Boolean showPhoneNumber) {
        System.out.println("Hello "+customer.customerName+
                ", thanks for registering phone number "
                +(showPhoneNumber ? customer.customerPhoneNumber:"**********"));
    }

    static class Customer {

        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                    '}';
        }
    }

}
