package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        String phoneNumber1 = "4421234567";
        String phoneNumber2 = "442123456";
        String phoneNumber3 = "5522345678";

        System.out.println("//Java Functions");
        System.out.println(isPhoneNumberValid(phoneNumber1));
        System.out.println(isPhoneNumberValid(phoneNumber2));
        System.out.println(isPhoneNumberValid(phoneNumber3));

        System.out.println("//Predicate");
        System.out.println(isPhoneNumberValidPredicate.test(phoneNumber1));
        System.out.println(isPhoneNumberValidPredicate.test(phoneNumber2));
        System.out.println(isPhoneNumberValidPredicate.test(phoneNumber3));

        System.out.println("//Predicate and");
        System.out.println(
                "Is phone number valid and contains number 3 = "+
                isPhoneNumberValidPredicate.and(containsNumber3).test(phoneNumber1)
        );
        System.out.println(
                "Is phone number valid and contains number 3 = "+
                        isPhoneNumberValidPredicate.and(containsNumber3).test(phoneNumber2)
        );
        System.out.println(
                "Is phone number valid or contains number 3 = "+
                        isPhoneNumberValidPredicate.or(containsNumber3).test(phoneNumber3)
        );


    }

    static Boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("44") && phoneNumber.length() == 10;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("44") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

}
