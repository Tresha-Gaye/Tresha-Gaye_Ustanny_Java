package com.company.M2ChallengeUstannyTreshaGaye.controller;

import com.company.M2ChallengeUstannyTreshaGaye.model.MathSolution;
import com.company.M2ChallengeUstannyTreshaGaye.model.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@WebMvcTest(MathSolutionController.class)
public class MathSolutionControllerTest {

    // Wiring in the MockMvc object
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() {

    }

    @Test
    public void shouldReturnSumOfTwoOperands() throws Exception {
        // ARRANGE
        MathSolution solution1 = new MathSolution(2, 2);
        solution1.setOperation("add");
        solution1.add();

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(solution1);

        // ACT
        mockMvc.perform(
                        post("/add")                                    // Perform the POST request.
                                .content(inputJson)                               // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                                     // Print results to console.
                .andExpect(status().isCreated())
                .andExpect(content().json("{\"operand1\":2,\"operand2\":2,\"operation\":\"add\",\"answer\":4}"));
    }

    @Test
    public void shouldReturn422StatusCodeIfOperandIsNotANumber() throws Exception {
        // ARRANGE
        MathSolution solution1 = new MathSolution();
//        solution1.setOperation("add");
//        solution1.add();

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(solution1);

        // ACT
        mockMvc.perform(
                        post("/add")                                // Perform the POST request.
                                .content(inputJson)                               // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\"operand1\":\"two\",\"operand2\":2}")// Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)
    }


//    @Test
//        public void shouldReturn422StatusCodeIfOneOperandMissing() throws Exception {
//            // ARRANGE
//            MathSolution tester = new MathSolution(2, 2);
//            tester.setOperation("add");
//            tester.add();
//
//            // Convert Java Object to JSON.
//            String inputJson = mapper.writeValueAsString(tester);
//
//            // ACT
//            mockMvc.perform(
//                            post("/add")                                    // Perform the POST request.
//                                    .content(inputJson)                               // Set the request body.
//                                    .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
//                    )
//                    .andDo(print())                                                     // Print results to console.
//                    .andExpect(status().isUnprocessableEntity());                       // ASSERT (status code is 422)
//        }







}