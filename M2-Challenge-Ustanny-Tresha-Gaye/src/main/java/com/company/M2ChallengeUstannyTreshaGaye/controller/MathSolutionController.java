package com.company.M2ChallengeUstannyTreshaGaye.controller;

import com.company.M2ChallengeUstannyTreshaGaye.model.MathSolution;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MathSolutionController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution addMath (@RequestBody @Valid MathSolution answer) {

        answer.setOperation("add");
        answer.add();

        return answer;

    }

    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution subtractMath (@RequestBody @Valid MathSolution answer) {

        answer.setOperation("subtract");
        answer.subtract();

        return answer;

    }

    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution multiplyMath (@RequestBody @Valid MathSolution answer) {

        answer.setOperation("multiply");
        answer.multiply();

        return answer;
    }

    @RequestMapping(value = "/divide", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution divideMath (@RequestBody @Valid MathSolution answer) {

        answer.setOperation("divide");
        answer.divide();

        return answer;
    }

}
