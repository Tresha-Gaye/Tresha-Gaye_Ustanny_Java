package com.company.M2ChallengeUstannyTreshaGaye.controller;

import com.company.M2ChallengeUstannyTreshaGaye.exceptions.NotFoundException;
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
    public MathSolution addMath (@RequestBody @Valid MathSolution solution) {

        solution.setOperation("add");
        solution.add();

        return solution;

    }

    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution subtractMath (@RequestBody @Valid MathSolution solution) {

        solution.setOperation("subtract");
        solution.subtract();

        return solution;

    }

    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution multiplyMath (@RequestBody @Valid MathSolution solution) {

        solution.setOperation("multiply");
        solution.multiply();

        return solution;
    }

    @RequestMapping(value = "/divide", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution divideMath (@RequestBody @Valid MathSolution solution) throws Exception {

        solution.setOperation("divide");
        solution.divide();

        return solution;
    }

}
