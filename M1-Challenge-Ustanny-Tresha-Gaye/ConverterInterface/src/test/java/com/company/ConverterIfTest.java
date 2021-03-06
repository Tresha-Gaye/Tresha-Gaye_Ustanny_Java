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
    public void shouldConvertToMonthIfMonthNumberBetweenOneAndTwelve() {
//    Converter convertTest = new ConverterIf();
        String expectedOutput = "Month 3 is MARCH";
        String actualOutput = converter.convertMonth(3);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void shouldConvertToWeekdayIfDayNumberBetweenOneAndSeven() {
        String expectedOutput = "Day 3 is Tuesday";
        String actualOutput = converter.convertDay(3);
        assertEquals(expectedOutput, actualOutput);

    }

}