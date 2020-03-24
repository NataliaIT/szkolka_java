package pl.accenture.szkolka.pp;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class ZadaniaIndywidualne {
    //​
    //    // done 1 zadeklaruj zmienne z typami prostymi występującymi z Javie
    //​
    //    // done 2 zadeklaruj metody zwracające te zmienne
    //​
    //    // done 3 utwórz testy dla metod z punktu 2
    //​
    //    // done 4 utwórz metodę void wypisującą do loggera "Hello"
    //​
    //    // done 5 utwórz metodę void wypisującą do loggera "Hello " + przekazany do metody argument (String)
    //​
    //    // done 6 utwórz metodę zwracającą  "Hello " + przekazany do metody argument (String)
    //​
    //    /*
    //            TODO 7 utwórz testy dla metod z punktów 4-6, dla testowania logowanych wartości, użyj
    //            https://github.com/netmikey/logunit
    //     */
    //


    public static byte byteVar;
    public static short ShortVar;
    public static int intVar;
    public static long longVar;
    public static boolean booleanVar;
    public static char charVar;
    public static float floatVar;
    public static double doubeVar;

    public static byte getByteVar() {
        return byteVar;
    }

    public static short getShortVar() {
        return ShortVar;
    }

    public static int getIntVar() {
        return intVar;
    }

    public static long getLongVar() {
        return longVar;
    }

    public static boolean isBooleanVar() {
        return booleanVar;
    }

    public static char getCharVar() {
        return charVar;
    }

    public static float getFloatVar() {
        return floatVar;
    }

    public static double getDoubeVar() {
        return doubeVar;
    }

    private static final Logger LOG = getLogger("pl.accenture.szkolka.pp.Krok1");

    public static void hello1(String argument) {
        LOG.log(Level.INFO, String.format("Hello, %s%n", argument));

    }

    public static String hello2(String argument) {

                return "Hello" + argument;
    }





}
