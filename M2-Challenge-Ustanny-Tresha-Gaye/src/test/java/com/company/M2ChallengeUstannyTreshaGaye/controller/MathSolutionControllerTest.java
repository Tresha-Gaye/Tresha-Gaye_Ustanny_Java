package com.company.M2ChallengeUstannyTreshaGaye.controller;

import com.company.M2ChallengeUstannyTreshaGaye.model.MathSolution;
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
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json("{\"operand1\":2,\"operand2\":2,\"operation\":\"add\",\"answer\":4}"));
    }

    @Test
    public void shouldReturn422StatusCodeIfAddingAndOperandIsNotANumber() throws Exception {
        // ARRANGE
        MathSolution solution1 = new MathSolution();

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(solution1);

        // ACT
        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\"operand1\":\"two\",\"operand2\":2}")
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusCodeIfOperandValueIsOutOfRange() throws Exception {
        // ARRANGE
        MathSolution solution1 = new MathSolution();
        solution1.setOperand2(120000);
        solution1.setOperand1(200000);

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(solution1);

        // ACT
        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)

                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturnDifferenceOfTwoOperands() throws Exception {
        // ARRANGE
        MathSolution solution1 = new MathSolution(4, 2);
        solution1.setOperation("subtract");
        solution1.subtract();

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(solution1);

        // ACT
        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json("{\"operand1\":4,\"operand2\":2,\"operation\":\"subtract\",\"answer\":2}"));
    }

    @Test
    public void shouldReturn422StatusCodeIfSubtractingAndAnOperandIsNotANumber() throws Exception {
        // ARRANGE
        MathSolution solution1 = new MathSolution();

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(solution1);

        // ACT
        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\"operand1\":\"twelve\",\"operand2\":2}")
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
    @Test
    public void shouldReturnProductOfTwoOperands() throws Exception {
        // ARRANGE
        MathSolution solution1 = new MathSolution(2, 2);
        solution1.setOperation("multiply");
        solution1.multiply();

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(solution1);

        // ACT
        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json("{\"operand1\":2,\"operand2\":2,\"operation\":\"multiply\",\"answer\":4}"));
    }

    @Test
    public void shouldReturn422ErrorIfMultiplyingByAnyOperandThatIsNotANumber() throws Exception {
        MathSolution solution1 = new MathSolution();

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(solution1);

        // ACT
        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\"operand1\":\"three\",\"operand2\":\"four\"}")
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
    @Test
    public void shouldReturnQuotientOfTwoOperands() throws Exception {
        // ARRANGE
        MathSolution solution1 = new MathSolution(2, 2);
        solution1.setOperation("divide");
        solution1.divide();

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(solution1);

        // ACT
        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json("{\"operand1\":2,\"operand2\":2,\"operation\":\"divide\",\"answer\":1}"));
    }

    @Test
    public void shouldReturn422ErrorIfDividingAndOperand2IsZero() throws Exception {
        // ARRANGE
        MathSolution solution1 = new MathSolution(2, 0);

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(solution1);

        // ACT
        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());

    }

    @Test
    public void shouldReturn422ErrorIfDividingAndAnyOperandIsNotANumber() throws Exception {
        // ARRANGE
        MathSolution solution1 = new MathSolution();

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(solution1);

        // ACT
        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\"operand1\":20,\"operand2\":\"four\"}")

                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());

    }

}