package pl.accenture.szkolka.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

public class ZadanieZTrenerem5 {
    public static void main(String[] args) {

        List<Integer> liczbyPierwsze = List.of(5,7,11);
        List<Integer> liczbyNieparzyste = List.of(2,4,6);
        List<Integer> liczbyParzyste = List.of(1,3,5);


        List<List<Integer>> listaDoSplaszczenia = List.of(liczbyPierwsze, liczbyNieparzyste, liczbyParzyste);

        System.out.println(listaDoSplaszczenia);


        var listaPoSplaszczeniu = listaDoSplaszczenia
                .stream()
                .flatMap(List::stream)
                .sorted()
                .collect(Collectors.toList());


        System.out.println("Po splaszczeniu: " + listaPoSplaszczeniu);

    }
}







