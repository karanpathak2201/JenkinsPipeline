package com.nagarro.DevOpsAssignment.controllerTest;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.equalTo;

import com.nagarro.DevOpsAssignment.controller.GreetingController;

@WebMvcTest
public class GreetingControllerTest {

	@InjectMocks
    private GreetingController greetingController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGreetingEndpoint() throws Exception {
        mockMvc.perform(get("/greeting"))
               .andExpect(status().isOk())
               .andExpect(content().string(equalTo("Hello, World!")));
    }
}
