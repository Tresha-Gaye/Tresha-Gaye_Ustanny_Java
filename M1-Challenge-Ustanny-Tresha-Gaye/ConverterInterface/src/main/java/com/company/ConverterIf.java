package com.company;

import com.company.interfaces.Converter;

// import Month() & DayOfWeek() methods from ja.time package
import java.time.Month;
import java.time.DayOfWeek;

// implement the Converter interface on the ConverterIf class
public class ConverterIf implements Converter {

    // create an object of type Month or type DayofWeek that's accessible to the respective methods
    private Month month;
    private DayOfWeek weekday;

    public int convertMonth(int monthNumber) {

        // use if/else if/else
        // find out if you need to actually use multiiple if/else statements,
        // if the java.time package doesn't meet requirements

        if ((monthNumber > 1) && (monthNumber < 12)) {
            month = Month.of(monthNumber);
            System.out.println(monthNumber + " is converted to " + month + " using if/else statement!");
        }
        // consider adding extra line of  code to incorporate else if statement
        else {
            System.out.println("ERROR: Please enter a number between 1 & 12");
        }
        return monthNumber;
    }

    public int convertDay(int dayNumber) {
        if ((dayNumber > 1) && (dayNumber < 7)) {
            weekday = DayOfWeek.of(dayNumber);
            System.out.println(dayNumber + " is converted to " + weekday + " using if/else statement!");
        }
        else {
            System.out.println("ERROR: Please enter a number between 1 & 7");
        }
        return dayNumber;
    }

    @Override
    public String toString() {
        return "ConverterIf{" +
                "month=" + month +
                ", weekday=" + weekday +
                '}';
    }
}
