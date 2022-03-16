package lambdas;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        System.out.println(upperCaseName.apply("Omar"));

    }

    static Function<String, String> upperCaseName = name -> {
            if (name.isBlank()) throw new IllegalArgumentException("Name not provided");
            return name.toUpperCase();
    };
}
