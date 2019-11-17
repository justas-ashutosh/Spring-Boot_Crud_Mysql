package com.example.learning.CrudApp.Controller;


import com.example.learning.CrudApp.Controllers.PrimaryController;
import com.example.learning.CrudApp.Services.BookService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
public class PrimaryControllerTest {

    private MockMvc mockMvc;

    @Mock
    private BookService bookService;

    @InjectMocks
    private PrimaryController primaryController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(primaryController).build();
    }

    @Test
    public void testGetBooks () throws Exception {
        when(bookService.getallBooks()).thenReturn(new ArrayList<>());

        this.mockMvc.perform(get("/books"))
                .andExpect(status().isOk());

    }
}
