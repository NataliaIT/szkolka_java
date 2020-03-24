package pl.accenture.szkolka;

import pl.accenture.szkolka.pp.Krok1;

import static pl.accenture.szkolka.pp.Krok1.hello;

public class Main {
    public static void main(String... args) {
        //System.out.println("Hello, World!");


        for (String arg : args) {
            hello(arg);
        }

//        hello(args[0]);
//        hello(args[2]);
//        hello(args[1]);
    }
}
