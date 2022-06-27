package com.company;

import com.company.interfaces.Converter;

import java.time.Month;
import java.time.DayOfWeek;

public class ConverterIf implements Converter {

    private Month month;
    private DayOfWeek weekday;

    public void convertMonth(int monthNumber) {

        // use if/else if/else
        // actually use 12 if/else statements, not the package

        if ((monthNumber > 1) && (monthNumber < 12)) {
            month = Month.of(monthNumber);
            System.out.println(monthNumber + " is converted to " + month + " using if/else statement!");
        }
        else {
            System.out.println("ERROR: Please enter a number between 1 & 12");
        }
    }

    public void convertDay(int dayNumber) {
        if ((dayNumber > 1) && (dayNumber < 7)) {
            weekday = DayOfWeek.of(dayNumber);
            System.out.println(dayNumber + " is converted to " + weekday + " using if/else statement!");
        }
        else {
            System.out.println("ERROR: Please enter a number between 1 & 7");
        }
    }

    @Override
    public String toString() {
        return "ConverterIf{" +
                "month=" + month +
                ", weekday=" + weekday +
                '}';
    }
}
