package com.company.M2ChallengeUstannyTreshaGaye.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class MonthConverterController {

    @RequestMapping(value = "/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getMonth(@PathVariable String monthNumber) {

        switch (monthNumber) {
            case "1":
                return "1-January";
            case "2":
                return "2-February";
            case "3":
                return "3-March";
            case "4":
                return "4-April";
            case "5":
                return "5-May";
            case "6":
                return "6-June";
            case "7":
                return "7-July";
            case "8":
                return "8-August";
            case "9":
                return "9-September";
            case "10":
                return "10-October";
            case "11":
                return "11-November";
            case "12":
                return "12-December";
            default:
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Invalid Month Number Specified");
        }
    }
}



