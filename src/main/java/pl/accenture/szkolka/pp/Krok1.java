package pl.accenture.szkolka.pp;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

/**
 * zmienne | metody | JUnit
 */
/*    W klasie utwórz metodę public static String hello(String name) logującą "Hello, <name>!"
        Zadeklaruj logger w klasie
        Użyj logger w metodzie*/
public class Krok1 {

    private static final Logger LOG = getLogger("pl.accenture.szkolka.pp.Krok1");

    public static void hello(String name) {
        LOG.log(Level.INFO, String.format("Hello, %s!%n", name));
        //System.out.printf("Hello, %s!%n", name);
    }
}


