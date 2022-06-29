package com.company;

import com.company.interfaces.Converter;

import java.time.Month;

public class ConverterSwitch implements Converter {

    private Month month;

    public String convertMonth(int monthNumber) {
        month = Month.of(monthNumber);

        String toMonth = "";

        switch(monthNumber) {
            case 1:
                toMonth = String.valueOf(Month.of(1));
                break;
            case 2:
                toMonth = String.valueOf(Month.of(2));
                break;
            case 3:
                toMonth = String.valueOf(Month.of(3));
                break;
            case 4:
                toMonth = String.valueOf(Month.of(4));
                break;
            case 5:
                toMonth = String.valueOf(Month.of(5));
                break;
            case 6:
                toMonth = String.valueOf(Month.of(6));
                break;
            case 7:
                toMonth = String.valueOf(Month.of(7));
                break;
            case 8:
                toMonth = String.valueOf(Month.of(8));
                break;
            case 9:
                toMonth = String.valueOf(Month.of(9));
                break;
            case 10:
                toMonth = String.valueOf(Month.of(10));
                break;
            case 11:
                toMonth = String.valueOf(Month.of(11));
                break;
            case 12:
                toMonth = String.valueOf(Month.of(12));
                break;
            default:
                System.out.println("Enter an integer between 1 and 12");
        }
        System.out.println("Month " + monthNumber + " is " + month + "!");
        return toMonth;
    }

    public String convertDay(int dayNumber) {

        String dayOfWeek = "";

        switch(dayNumber) {
            case 1:
                dayOfWeek = "Sunday";
//                System.out.println("Day 1 is Sunday!");
                break;
            case 2:
                dayOfWeek = "Monday";
//                System.out.println("Day 2 is Monday!");
                break;
            case 3:
                dayOfWeek = "Tuesday";
//                System.out.println( "Day 3 is Tuesday!");
                break;
            case 4:
                dayOfWeek = "Wednesday";
//                System.out.println( "Day 4 is Wednesday!");
                break;
            case 5:
                dayOfWeek = "Thursday";
//                System.out.println( "Day 5 is Thursday!");
                break;
            case 6:
                dayOfWeek = "Friday";
//                System.out.println("Day 6 is Friday!");
                break;
            case 7:
                dayOfWeek = "Saturday";
//                System.out.println("Day 7 is Saturday!");
            default:
                System.out.println("Enter an integer between 1 and 7");
        }
        System.out.println("Day " + dayNumber + " is " + dayOfWeek + "!");
        return dayOfWeek;
    }

    @Override
    public String toString() {
        return "ConverterSwitch{" +
                "month=" + month +
                '}';
    }
}
