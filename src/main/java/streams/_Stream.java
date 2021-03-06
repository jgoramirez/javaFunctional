package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Omar", MALE),
                new Person("John", MALE),
                new Person("Alissa", FEMALE),
                new Person("Maria", FEMALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );

        System.out.println("Generos:");

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Nombres:");

        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Largo nombres:");

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);


        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        boolean containsOnlyFemales = people.stream()
                .allMatch(personPredicate);

        System.out.println(containsOnlyFemales);

        boolean containsSomeFemales = people.stream()
                .anyMatch(personPredicate);

        System.out.println(containsSomeFemales);

        boolean containsNoneFemales = people.stream()
                .noneMatch(personPredicate);

        System.out.println(containsNoneFemales);


    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        FEMALE,
        MALE,
        PREFER_NOT_TO_SAY
    }

}
