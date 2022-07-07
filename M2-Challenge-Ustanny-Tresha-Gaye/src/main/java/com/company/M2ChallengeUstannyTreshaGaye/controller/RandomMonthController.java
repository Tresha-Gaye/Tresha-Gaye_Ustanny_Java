//package com.company.M2ChallengeUstannyTreshaGaye.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.Random;
//
//@RestController
//public class RandomMonthController {
//
//    @RequestMapping(value = "/randomMonth", method = RequestMethod.GET)
//    @ResponseStatus(value = HttpStatus.OK)
//
//    public String getRandomMonth() {
//        Random randomMonthNumber = new Random();
//        int randomMonthId = randomMonthNumber.nextInt(12);
//
//        switch (randomMonthId) {
//            case 1:
//                return "January";
//            case 2:
//                return "February";
//            case 3:
//                return "March";
//            case 4:
//                return "April";
//            case 5:
//                return "May";
//            case 6:
//                return "June";
//            case 7:
//                return "July";
//            case 8:
//                return "August";
//            case 9:
//                return "September";
//            case 10:
//                return "October";
//            case 11:
//                return "November";
//            case 12:
//                return "December";
//            default:
//                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Invalid Month Number Specified");
//        }
//    }
//}
//
