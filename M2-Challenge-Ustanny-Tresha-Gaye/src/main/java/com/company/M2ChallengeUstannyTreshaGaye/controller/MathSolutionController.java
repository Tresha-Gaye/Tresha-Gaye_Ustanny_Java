package com.company.M2ChallengeUstannyTreshaGaye.controller;

import com.company.M2ChallengeUstannyTreshaGaye.model.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MathSolutionController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution addMath (@RequestBody @Valid int operand1, @RequestBody @Valid int operand2) {

        MathSolution adder = new MathSolution();

        adder.setOperation("add");
        adder.getOperand1();
        adder.getOperand2();
        adder.add(operand1, operand2);

        return adder;

    }


}
