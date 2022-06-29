package com.company;


import com.company.interfaces.Converter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterSwitchTest {
    private Converter converter;

    @Before
    public void conversionInput () {
        converter = new ConverterSwitch();
    }

    @Test
    public void shouldConvertToMonthIfMonthNumberBetweenOneAndTwelve() {
        String expectedOutput = "JUNE";
        String actualOutput = converter.convertMonth(6);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void shouldConvertToWeekdayIfDayNumberBetweenOneAndSeven() {
        String expectedOutput = "Thursday";
        String actualOutput = converter.convertDay(5);
        assertEquals(expectedOutput, actualOutput);

    }

}