package com.company.M2ChallengeUstannyTreshaGaye.controller;

import com.company.M2ChallengeUstannyTreshaGaye.model.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
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

@RunWith(SpringRunner.class)
@WebMvcTest(MonthConverterController.class)
public class MonthConverterControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturn404StatusCodeIfMonthNumberNotFound() throws Exception {
        mockMvc.perform(get("/month/13"))
                .andDo(print())
                .andExpect(status().isNotFound());
    }

    @Test
    public void shouldReturnMonthByMonthNumber() throws Exception {

        // ARRANGE
        Month outputMonth = new Month();
        outputMonth.setName("November");
        outputMonth.setNumber(11);

        String outputJson = mapper.writeValueAsString(outputMonth);

        // ACT
        mockMvc.perform(get("/month/11"))
                .andDo(print())
                .andExpect(status().isOk())                     // ASSERT that we got back 200 OK.
                .andExpect(content().json(outputJson));         // ASSERT that what we're expecting is what we got back.
    }

    @Test
    public void shouldReturn422StatusCodeIfInputOutOfRange() throws Exception {
        mockMvc.perform(get("/month/january"))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)
    }

    @Test
    public void shouldReturnNonEmptyValue() throws Exception {
        mockMvc.perform(get("/randomMonth"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty()
                );
    }

    @Test
    public void shouldReturnAValueFromMonthList() throws Exception {
        mockMvc.perform(get("/randomMonth"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").isNotEmpty())
                .andExpect(jsonPath("$.number").isNotEmpty());
    }

}