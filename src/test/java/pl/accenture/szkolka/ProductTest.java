package pl.accenture.szkolka;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    @DisplayName("1 -> 1")
    void getPrice() {
        //given
        float expectedValue = 1;
        Product.price = expectedValue;
        //when
        float returnedPrice = Product.getPrice();
        //then
        assertEquals(expectedValue, returnedPrice);
    }

    @Test
    @DisplayName(" Kalkulator -> Kalkulator")
    void getProductName() {
        //given
        String expectedValue = "Kalkulator";
        Product.productName = expectedValue;
        //when
        String returnedProductName = Product.getProductName();
        //then
        assertEquals(expectedValue, returnedProductName);
    }

    @DisplayName(" 5 -> 5")
    void getCategoryNumber() {
        //given
        int expectedValue = 5;
        Product.categoryNumber = expectedValue;
        //when
        int returnedCategoryNumber = Product.getCategoryNumber();
        //then
        assertEquals(expectedValue, returnedCategoryNumber);
    }


}