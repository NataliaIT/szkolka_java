package pl.accenture.szkolka;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OcenyTest {

    @Test
    void menu() {

    }

//    @Test
//    public void testGetResponse() {
//        String request = "<some>request</some>";
//        String expResult = "<some>response</some>";
//        String result = instance.getResponse(request);
//        assertEquals(expResult, result);
//    }

    @Test
    void jakaOcenaIF() {
        int request = 4;
        String expResult = "dobry";
        String result = Oceny.jakaOcenaIF(request);
        assertEquals(expResult, result);
    }

    @Test
    void jakaOcenaSWITCH() {
        //given
        int request =4;
        String expectedValue = Oceny.dobry;
         //when
        Oceny.jakaOcenaSWITCH(request);
        //then
 //       assertEquals(expectedValue, Oceny.jakaOcenaSWITCH(request));

    }



    @Test
    void doWhilePrzyklad() {
    }

    @Test
    void przykladForBreak() {
    }

    @Test
    void przykladForEachContinue() {
    }

    @Test
    void tablicaPrzyklad() {
    }
}