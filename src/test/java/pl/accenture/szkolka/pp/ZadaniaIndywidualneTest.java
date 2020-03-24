package pl.accenture.szkolka.pp;

import io.github.netmikey.logunit.api.LogCapturer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZadaniaIndywidualneTest {

 //   @RegisterExtension
  //  LogCapturer logs = LogCapturer.create().captureForType(Krok1.class);

    @Test
    @DisplayName("1 -> 1")
    void getByteVarTest() {
        //given
        var byteVar = 1;
        //when
        byte returnedByte = ZadaniaIndywidualne.getByteVar();
        //then
        assertEquals(ZadaniaIndywidualne.byteVar, returnedByte);

    }

    @Test
    void getShortVar(2->2) {
        //given
        var shortVar = 2;
        //when
        short returnedShort = ZadaniaIndywidualne.getShortVar();
        //then
        assertEquals(ZadaniaIndywidualne.byteVar, returnedShort);
    }

    @Test
    void getIntVar() {
        //given
        var intVar = 2;
        //when
        int returnedInt = ZadaniaIndywidualne.getIntVar();
        //then
        assertEquals(ZadaniaIndywidualne.intVar, returnedInt);
    }

    @Test
    void getLongVar() {
        //given
        var LongVar = 3;
        //when
        long returnedLong = ZadaniaIndywidualne.getLongVar();
        //then
        assertEquals(ZadaniaIndywidualne.longVar, returnedLong);
    }

    @Test
    void isBooleanVar(true -> true) {
        //given
        var booleanVar = true;
        //when
        int returnedBoolean = ZadaniaIndywidualne.isBooleanVar();
        //then
        assertEquals(ZadaniaIndywidualne.booleanVar, returnedBoolean);
    }

    @Test
    void getCharVar() {
        //given
        var charVar = 2;
        //when
        int returnedChar = ZadaniaIndywidualne.getCharVar();
        //then
        assertEquals(ZadaniaIndywidualne.charVar, returnedChar);
    }

    @Test
    void getFloatVar() {
    }

    @Test
    void getDoubeVar() {
    }
}