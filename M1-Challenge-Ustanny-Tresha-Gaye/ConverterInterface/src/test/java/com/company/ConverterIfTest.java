package com.company;

import com.company.interfaces.Converter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterIfTest {

    private Converter converter;

    @Before
    public void conversionInput () {
        converter = new ConverterIf();
    }

    @Test
    public void shouldConvertMonthIfOneToTwelve() {
//    Converter convertTest = new ConverterIf();
        int expectedOutput = 3;
        int actualOutput = converter.convertMonth(3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldCauseErrorAboveTwelve() {
        int expectedOutput = 13;
        int actualOutput = converter.convertMonth(13);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void shouldConvertDayIfOneToSeven() {
        int expectedOutput = 3;
        int actualOutput = converter.convertDay(3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldCauseErrorAboveSeven() {
        int expectedOutput = 9;
        int actualOutput = converter.convertDay(9);
        assertEquals(expectedOutput, actualOutput);

    }
}