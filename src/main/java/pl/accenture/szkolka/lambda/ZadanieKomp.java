package pl.accenture.szkolka.lambda;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;

public class ZadanieKomp {
    public static void main(String[] args) {

        List.of(
                new Person2("Lukasz", "Wilk"),
                new Person2("Adam", "Wilk"),
                new Person2("Zenek", "Nowak"),
                new Person2("Sandra", "Sowa")
        ).stream()
                .sorted(Person2.posortujPoImieniu.thenComparing(Person2.posortujPoNazwisku.reversed()))
                .forEach(System.out::println);


    }
}


@Data
@AllArgsConstructor
class Person2 {

    private String name;
    private String lastName;

    static Comparator<Person2> posortujPoImieniu = Comparator.comparing(p -> p.name);
    static Comparator<Person2> posortujPoNazwisku = (p1, p2) -> p1.getName().compareTo(p2.getName());
}
