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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
        public void shouldReturn422StatusCodeIfOneOperandMissing() throws Exception {
            // ARRANGE
            MathSolution tester = new MathSolution();
            tester.setOperand1(2);
            tester.setOperation("add");
            tester.add();

            // Convert Java Object to JSON.
            String inputJson = mapper.writeValueAsString(tester);

            // ACT
            mockMvc.perform(
                            post("/add")                                    // Perform the POST request.
                                    .content(inputJson)                               // Set the request body.
                                    .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                    )
                    .andDo(print())                                                     // Print results to console.
                    .andExpect(status().isUnprocessableEntity());                       // ASSERT (status code is 422)
        }

//
//
//        @Test
//        public void shouldReturn422StatusCodeIfRequestBodyIsInvalid() throws Exception {
//            Record inputRecord = new Record();
//            inputRecord.setArtist("William Joel");
//            inputRecord.setAlbum("The Stranger");
//            inputRecord.setId(2);
//
//            String inputJson = mapper.writeValueAsString(inputRecord);
//
//            mockMvc.perform(
//                            put("/records/2")
//                                    .content(inputJson)
//                                    .contentType(MediaType.APPLICATION_JSON)
//                    )
//                    .andDo(print())
//                    .andExpect(status().isUnprocessableEntity());
//        }
//
//
//
//        // testing POST /records
//        @Test
//        public void shouldReturnNewRecordOnPostRequest() throws Exception {
//
//            // ARRANGE
//            Record inputRecord = new Record();
//            inputRecord.setArtist("Bruce Springsteen");
//            inputRecord.setAlbum("The River");
//            inputRecord.setYear("1980");
//
//            // Convert Java Object to JSON.
//            String inputJson = mapper.writeValueAsString(inputRecord);
//
//            Record outputRecord = new Record();
//            outputRecord.setArtist("Bruce Springsteen");
//            outputRecord.setAlbum("The River");
//            outputRecord.setYear("1980");
//            outputRecord.setId(6);
//
//            String outputJson = mapper.writeValueAsString(outputRecord);
//
//            // ACT
//            mockMvc.perform(
//                            post("/records")                            // Perform the POST request.
//                                    .content(inputJson)                           // Set the request body.
//                                    .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
//                    )
//                    .andDo(print())                                // Print results to console.
//                    .andExpect(status().isCreated())               // ASSERT (status code is 201)
//                    .andExpect(content().json(outputJson));        // ASSERT that what we're expecting is what we got back.
//        }
//
//
//
//
//

//    }
//

}