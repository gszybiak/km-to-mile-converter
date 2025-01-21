package com.example.km_to.mile_converter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
public class KmToMileControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testConvertKmToMile() throws Exception {
        mockMvc.perform(get("/convert")
                        .param("kilometers", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("3.106855"));
    }
}
