package action.in.blog.controller;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ContentTypeControllerTest {

    @Test
    public void givenMissRequestBody_whenPost_thenErrorOccur() throws Exception {

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new ContentTypeController()).build();

        mockMvc.perform(post("/request-body"))
                .andExpect(status().is4xxClientError());
    }
}
