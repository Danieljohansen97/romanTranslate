package no.kristiania.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumbersTest {


    @Test
    void shouldCalculateFourLikeDigits() {
        Assertions.assertEquals("CDXLIV", RomerTranslate.toRoman(444));
    }
    @Test
    void shouldCalculateNineLikeDigits() {

        Assertions.assertEquals("CMXCIX", RomerTranslate.toRoman(999));
    }
    @Test
    void shouldCalculateSimpleDigits() {

        Assertions.assertEquals("MMMDCCCLXXXVIII", RomerTranslate.toRoman(3888));
    }
}