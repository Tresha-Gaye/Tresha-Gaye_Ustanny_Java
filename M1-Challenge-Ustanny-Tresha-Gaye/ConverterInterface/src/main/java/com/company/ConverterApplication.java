package com.company;

import com.company.interfaces.Converter;

public class ConverterApplication {

    public static void main(String[] args) {

         Converter ifElse = new ConverterIf();
         Converter switchCase = new ConverterSwitch();

         ifElse.convertMonth(5);
         ifElse.convertDay(6);

         switchCase.convertDay(2);
         switchCase.convertMonth(11);

    }
}
