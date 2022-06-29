package com.company;

import com.company.interfaces.Converter;


import java.time.Month;  // import Month() method from java.time package
import java.util.Objects;

public class ConverterIf implements Converter {

    // create an object of type Month that's accessible to the convertMonth method
    private Month month;

    public String convertMonth(int monthNumber) {

        if ((monthNumber >= 1) && (monthNumber <= 12)) {
            month = Month.of(monthNumber);
        }
        else {
            System.out.println("ERROR: Please enter a number between 1 & 12");
        }
        System.out.println("Month " + monthNumber + " is " + month + "!");
        return "Month " + monthNumber + " is " + month;
    }

    // I did not use available DayOfWeek method from java.time because default start of week = Monday
    public String convertDay(int dayNumber) {

        String day = "";

        if (dayNumber == 1) {
            day = "Sunday";
            System.out.println("Day 1 is Sunday!");
        }
        else if (dayNumber == 2) {
            day = "Monday";
            System.out.println("Day 2 is Monday!");
        }
        else if (dayNumber == 3) {
            day = "Tuesday";
            System.out.println( "Day 3 is Tuesday!");
        }
        else if (dayNumber == 4) {
            day = "Wednesday";
            System.out.println( "Day 4 is Wednesday!");
        }
        else if (dayNumber == 5) {
            day = "Thursday";
            System.out.println( "Day 5 is Thursday!");
        }
        else if (dayNumber == 6) {
            day = "Friday";
            System.out.println("Day 6 is Friday!");
        }
        else if (dayNumber == 7) {
            day = "Saturday";
            System.out.println("Day 7 is Saturday!");
        }
        else {
            return "ERROR: Please enter a number between 1 & 7!";
        }
        return "Day " + dayNumber + " is " + day;
    }


    @Override
    public String toString() {
        return "ConverterIf{" +
                "month=" + month +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConverterIf)) return false;
        ConverterIf that = (ConverterIf) o;
        return month == that.month;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month);
    }
}
