package pl.accenture.szkolka.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaListyZadanie {
    public static void main(String[] args) {

        List<String> aList = Arrays.asList("a21", "a2", "a13", "a4", "b1", "b10", "b3", "b4","c1","c2","c3","c4");

        //odfiltruj b "".startsWith()
        //przekonwertuj do wielkiej MAP
        //posortuj
        //zebrac do Listy
        aList
                .stream()
                .filter(s -> s.startsWith("b"))
                .map(s -> s.toUpperCase())
                .sorted()
                .forEach(s -> System.out.println(s));


        aList
                .stream()
                .filter(s -> s.startsWith("b"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }


}
