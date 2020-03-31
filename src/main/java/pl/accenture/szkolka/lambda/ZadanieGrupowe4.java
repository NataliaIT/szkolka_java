package pl.accenture.szkolka.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ZadanieGrupowe4 {
    public static void main(String[] args) {

        var people4 = List.of(
                "Lukasz-Wyspianski",
                "Ania-Kowalska",
                "Janina-Kowalska"
        ).stream()
                .map(s -> s.split("-")[0])
                .collect(Collectors.toList());


        System.out.println(people4);
    }
}


@Data
@AllArgsConstructor
class Person4 {

    private String name;
    private String lastName;
}
