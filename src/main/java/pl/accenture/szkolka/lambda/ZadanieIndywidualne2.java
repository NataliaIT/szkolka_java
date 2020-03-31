package pl.accenture.szkolka.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;

public class ZadanieIndywidualne2 {

    public static void main(String[] args) {

        List<Person3> people3 = List.of(
                new Person3("Lukasz", "Wilk"),
                new Person3("Adam", "Wilk"),
                new Person3("Zenek", "Nowak"),
                new Person3("Sandra", "Sowa"),
                new Person3("Sandra", "Kowalski")
        );
        //sortuj i wyswietl po imieniu
        System.out.println("Sortowanie po imieniu:");
        people3.stream()
                .sorted(Person3.posortujPoImieniu.thenComparing(Person3.posortujPoNazwisku.reversed()))
                .forEach(System.out::println);

        //posortuj i wyswietl po nazwisku
        System.out.println("Sortowanie po nazwisku:");
        people3.stream()
                .sorted(Person3.posortujPoNazwisku)
                .forEach(System.out::println);

        //posortuj i wyswietl oba
        System.out.println("Sortowanie po nazwisku, potem po imieniu:");
        people3.stream()
                .sorted(Person3.posortujPoNazwisku.thenComparing(Person3.posortujPoImieniu))
                .forEach(System.out::println);

        //oba jeden odwrocona kolejnosc
        System.out.println("Sortowanie po imieniu, potem po nazwisku z odwrocona kolejnoscia:");
        people3.stream()
                .sorted(Person3.posortujPoImieniu.thenComparing(Person3.posortujPoNazwisku.reversed()))
                .forEach(System.out::println);


    }
}


@Data
@AllArgsConstructor
class Person3 {

    static Comparator<Person3> posortujPoImieniu = Comparator.comparing(p -> p.getName());
    static Comparator<Person3> posortujPoNazwisku = (p1, p2) -> p1.getName().compareTo(p2.getLastName());
    private String name;
    private String lastName;
}
