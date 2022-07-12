package com.company.M2ChallengeUstannyTreshaGaye.controller;

import com.company.M2ChallengeUstannyTreshaGaye.exceptions.NotFoundException;
import com.company.M2ChallengeUstannyTreshaGaye.model.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


@RestController
public class MonthConverterController {

    private static List<Month> months = new ArrayList<>(Arrays.asList(
            new Month("January", 1),
            new Month("February", 2),
            new Month("March", 3),
            new Month("April", 4),
            new Month("May", 5),
            new Month("June", 6),
            new Month("July", 7),
            new Month("August", 8),
            new Month("September", 9),
            new Month("October", 10),
            new Month("November", 11),
            new Month("December", 12)
    ));

    // GET month number

    @RequestMapping(value = "/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getMonthByMonthNumber(@PathVariable int monthNumber) {

        Month specifiedMonth = null;



            for(Month m : months) {
                if(m.getNumber() == monthNumber) {
                    specifiedMonth = m;
                    break;
                }
            }

            if(monthNumber < 1 || monthNumber > 12){
                throw new NotFoundException("Month not found: please enter month numbered 1 to 12");
            }

            return specifiedMonth;
    }


    // GET random month

    @RequestMapping(value = "/randomMonth", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getRandomMonth() {

        Random randomMonthGenerator = new Random();

        return months.get(randomMonthGenerator.nextInt(13));

    }
}




