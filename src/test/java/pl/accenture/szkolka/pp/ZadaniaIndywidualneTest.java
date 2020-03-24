package pl.accenture.szkolka.pp;

import io.github.netmikey.logunit.api.LogCapturer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.accenture.szkolka.pp.ZadaniaIndywidualne.HELLO_INFORMAL;

class ZadaniaIndywidualneTest {

    @RegisterExtension
    LogCapturer logs = LogCapturer.create().captureForType(Krok1.class);

    @Test
    @DisplayName("1 -> 1")
    void getByteVarTest() {
        //given
        byte expectedValue = 1;
        ZadaniaIndywidualne.byteVar = expectedValue;
        //when
        byte returnedByte = ZadaniaIndywidualne.getByteVar();
        //then
        assertEquals(expectedValue, returnedByte);

    }

    @Test
    @DisplayName("1 -> 1")
    void getShortVar() {
        //given
        var shortVar = 2;
        //when
        short returnedShort = ZadaniaIndywidualne.getShortVar();
        //then
        assertEquals(ZadaniaIndywidualne.byteVar, returnedShort);
    }

    @Test
    @DisplayName("2 -> 2")
    void getIntVar() {
        //given
        var intVar = 2;
        //when
        int returnedInt = ZadaniaIndywidualne.getIntVar();
        //then
        assertEquals(ZadaniaIndywidualne.intVar, returnedInt);
    }

    @Test
    @DisplayName("3 -> 3")
    void getLongVar() {
        //given
        var LongVar = 3;
        //when
        long returnedLong = ZadaniaIndywidualne.getLongVar();
        //then
        assertEquals(ZadaniaIndywidualne.longVar, returnedLong);
    }

    @Test
    @DisplayName("true -> true")
    void isBooleanVar() {
        //given
        var booleanVar = true;
        //when
        boolean returnedBoolean = ZadaniaIndywidualne.isBooleanVar();
        //then
        assertEquals(ZadaniaIndywidualne.booleanVar, returnedBoolean);
    }

    @Test
    @DisplayName("'a' -> 'a'")
    void getCharVar() {
        //given
        var charVar = 'a';
        //when
        char returnedChar = ZadaniaIndywidualne.getCharVar();
        //then
        assertEquals(ZadaniaIndywidualne.charVar, returnedChar);
    }

    @Test
    @DisplayName("2 -> 2")
    void getFloatVar() {
        //given
        var floatVar = 2;
        //when
        float returnedFloat = ZadaniaIndywidualne.getFloatVar();
        //then
        assertEquals(ZadaniaIndywidualne.charVar, returnedFloat);
    }

    @Test
    @DisplayName("12 ->12")
    void getDoubeVar() {
        //given
        var doubleVar = 2;
        //when
        double returnedDouble = ZadaniaIndywidualne.getDoubeVar();
        //then
        assertEquals(ZadaniaIndywidualne.charVar, returnedDouble);
    }

    @Test
    @DisplayName("argument -> Hello, argument")
    void logHello() {
        //given
        var name = "Natalia1";

        //when
        ZadaniaIndywidualne.logHello(name);
        //then

        logs.assertContains(HELLO_INFORMAL+name);
    }

    @Test
    @DisplayName("argument -> Hello, argument")
    void getGreeting() {
        //given
        var name = "Natalia2";
        //when
        String returnedArgument = ZadaniaIndywidualne.getGreeting(name);
        //then

        assertEquals(name, returnedArgument);

    }
}