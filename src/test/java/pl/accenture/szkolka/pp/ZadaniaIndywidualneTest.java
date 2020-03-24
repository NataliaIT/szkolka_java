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
    @DisplayName("2 -> 2")
    void getShortVar() {
        //given
        short expectedValue = 2;
        //when
        short returnedShort = ZadaniaIndywidualne.getShortVar();
        //then
        assertEquals(expectedValue, returnedShort);
    }

    @Test
    @DisplayName("2 -> 2")
    void getIntVar() {
        //given
        int expectedValue = 2;
        //when
        int returnedInt = ZadaniaIndywidualne.getIntVar();
        //then
        assertEquals(expectedValue, returnedInt);
    }

    @Test
    @DisplayName("3 -> 3")
    void getLongVar() {
        //given
       long expectedValue = 3;
        //when
        long returnedLong = ZadaniaIndywidualne.getLongVar();
        //then
        assertEquals(expectedValue, returnedLong);
    }

    @Test
    @DisplayName("true -> true")
    void isBooleanVar() {
        //given
        boolean expectedValue = true;
        //when
        boolean returnedBoolean = ZadaniaIndywidualne.isBooleanVar();
        //then
        assertEquals(expectedValue, returnedBoolean);
    }

    @Test
    @DisplayName("'a' -> 'a'")
    void getCharVar() {
        //given
        char expectedValue = 'a';
        //when
        char returnedChar = ZadaniaIndywidualne.getCharVar();
        //then
        assertEquals(expectedValue, returnedChar);
    }

    @Test
    @DisplayName("2 -> 2")
    void getFloatVar() {
        //given
        float expectedValue = 2;
        //when
        float returnedFloat = ZadaniaIndywidualne.getFloatVar();
        //then
        assertEquals(expectedValue, returnedFloat);
    }

    @Test
    @DisplayName("12 ->12")
    void getDoubeVar() {
        //given
        double expectedValue = 2;
        //when
        double returnedDouble = ZadaniaIndywidualne.getDoubeVar();
        //then
        assertEquals(expectedValue, returnedDouble);
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