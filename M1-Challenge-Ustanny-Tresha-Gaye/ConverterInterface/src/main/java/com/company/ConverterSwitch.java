package com.company;

import com.company.interfaces.Converter;

import java.time.DayOfWeek;
import java.time.Month;

public class ConverterSwitch implements Converter {

    private Month month;

    private DayOfWeek day;

    public void convertMonth(int monthNumber) {
        month = Month.of(monthNumber);

        /* alt implementation
        switch (dayNumber) {
        case 1:
        return "Sunday";
        (break statement is not necessary if using a return statement
        ...

        OR
        create variable
        String returnVal = "no day";
        switch (dayNumber) {
        case 1:
        returnVal = "Sunday";
        break;
        }
        return "no day";
         */


        switch(monthNumber) {
            case 1:
                Month.of(1);
                break;
            case 2:
                Month.of(2);
                break;
            case 3:
                Month.of(3);
                break;
            case 4:
                Month.of(4);
                break;
            case 5:
                Month.of(5);
                break;
            case 6:
                Month.of(6);
                break;
            case 7:
                Month.of(7);
                break;
            case 8:
                Month.of(8);
                break;
            case 9:
                Month.of(9);
                break;
            case 10:
                Month.of(10);
                break;
            case 11:
                Month.of(11);
                break;
            case 12:
                Month.of(12);
                break;
            default:
                System.out.println("Enter an integer between 1 and 12");
        }
        System.out.println("Month #" + monthNumber + " is the same as " + month + " (switch case)!");
    }

    public void convertDay(int dayNumber) {
        day = DayOfWeek.of(dayNumber);

        switch(dayNumber) {
            case 1:
                DayOfWeek.of(1);
                break;
            case 2:
                DayOfWeek.of(2);
                break;
            case 3:
                DayOfWeek.of(3);
                break;
            case 4:
                DayOfWeek.of(4);
                break;
            case 5:
                DayOfWeek.of(5);
                break;
            case 6:
                DayOfWeek.of(6);
                break;
            case 7:
                DayOfWeek.of(7);
                break;
            default:
                System.out.println("Enter an integer between 1 and 7");
        }
        System.out.println("Day #" + dayNumber + " is the same as " + day + " (switch case)!");
    }

    @Override
    public String toString() {
        return "ConverterSwitch{" +
                "month=" + month +
                ", day=" + day +
                '}';
    }
}
