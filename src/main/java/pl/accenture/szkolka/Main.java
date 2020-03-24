package pl.accenture.szkolka;

import pl.accenture.szkolka.pp.ZadaniaIndywidualne;

import static pl.accenture.szkolka.pp.ZadaniaIndywidualne.logHello;

public class Main {
    public static void main(String[] args) {

//

//        hello(args[0]);
//        hello(args[2]);
//        hello(args[1]);
        logHello("Natalia1");
        final var natalia2 = ZadaniaIndywidualne.getGreeting("Natalia2");
    }
}
