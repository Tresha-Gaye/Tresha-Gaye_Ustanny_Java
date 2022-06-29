package com.company;

import com.company.interfaces.Converter;

public class ConverterApplication {

    public static void main(String[] args) {

         Converter ifElse = new ConverterIf();
         Converter switchCase = new ConverterSwitch();

         ifElse.convertMonth(4);
         ifElse.convertDay(1);

         switchCase.convertDay(5);
         switchCase.convertMonth(11);


    }
}
