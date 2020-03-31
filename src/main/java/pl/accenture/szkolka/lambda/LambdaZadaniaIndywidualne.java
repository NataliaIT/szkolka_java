package pl.accenture.szkolka.lambda;
// TODO 1 Klasa person: name, lastName, age, nadpisz toString
// TODO 2 3 predykaty w klasie: imieNaA and nazwiskoNaB and wiekPowyzej20Lat
// TODO 3 kolekcja List<Person> (>5 lelemntów)
/*
        TODO 4 stream API:
        -odfiltruj uzywając 3 predykatów
        -wypisz do konsoli odfiltrowane elementy
 */

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static pl.accenture.szkolka.lambda.Person1.*;

public class LambdaZadaniaIndywidualne {

    public static void main(String[] args) {

        List<Person1> people1List = List.of(
                new Person1("Ania", "Biała", 35),
                new Person1("Agata", "Białka", 20),
                new Person1("Aneta", "Czarna", 10),
                new Person1("Zofia", "Biała", 38),
                new Person1("Anna-Maria", "Blue", 38)
        );

        var collect = people1List
                .stream()
                .filter(imieZaczynaSieNaAPredicate
                        .and(nazwiskoZaczynaSieNaBPredicate)
                        .and(wiekPowyzej10LatPredicate)
                )
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}

class Person1 {
    //Predykaty
    static Predicate<Person1> imieZaczynaSieNaAPredicate = person -> person.name.toUpperCase().startsWith("A");
    static Predicate<Person1> nazwiskoZaczynaSieNaBPredicate = person -> person.lastName.toUpperCase().startsWith("B");
    static Predicate<Person1> wiekPowyzej10LatPredicate = person -> (person.age > 10);


    String name;
    String lastName;
    int age;

    public Person1(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }


}
