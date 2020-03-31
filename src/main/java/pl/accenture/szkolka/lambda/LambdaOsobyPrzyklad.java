package pl.accenture.szkolka.lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static pl.accenture.szkolka.lambda.Person.imieKonczySieNaBPredicate;
import static pl.accenture.szkolka.lambda.Person.imieZaczynaSieNaBPredicate;

public class LambdaOsobyPrzyklad {

    public static void main(String[] args) {
        List<Person> peopleList = List.of(
                new Person("Bogdan"),
                new Person("Zosia"),
                new Person("Barbara"),
                new Person("Helena")
        );

        var collect = peopleList
                .stream()
                .filter(imieZaczynaSieNaBPredicate.or(imieKonczySieNaBPredicate))
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}

class Person{
    String name;
    //predykat moze byc przypisany do konkretnego obiektu
    //mozemy miec nie static tylko w oddzielnej class Predykaty i wtedy w main (w tym przypadku) dodac obiekt i odwolac
    static Predicate<Person> imieZaczynaSieNaBPredicate =  person  -> person.name.toUpperCase().startsWith("B");
    static Predicate<Person> imieKonczySieNaBPredicate =  person  -> person.name.toUpperCase().endsWith("B");

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
