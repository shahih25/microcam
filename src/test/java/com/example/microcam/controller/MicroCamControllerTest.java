package com.example.microcam.controller;

import com.example.microcam.service.MicroCamService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.doNothing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
public class MicroCamControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private MicroCamService microCamService;

    @Test
    void testGetMicroCam() throws Exception {
        doNothing().when(microCamService).saveMicroCam();
        mvc.perform(get("/hello?myName=Sample"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
