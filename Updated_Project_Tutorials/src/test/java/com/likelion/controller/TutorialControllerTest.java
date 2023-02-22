package com.likelion.controller;

import com.likelion.entity.Tutorial;
import com.likelion.service.TutorialService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(TutorialController.class)
class TutorialControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private TutorialService tutorialService;
    @Test
    void testGetAllTutorials() throws Exception {
        List<Tutorial> tutorials = new ArrayList<>();
        tutorials.add(new Tutorial(1l, "Test case 1", "For test case 1", true));

        when(tutorialService.findAll()).thenReturn(tutorials);

        mockMvc.perform(get("/api/tutorials"))
                .andExpect(status().isOk());
    }

    @Test
    void testGetTutorialsById() throws Exception {
        Tutorial tutorial = new Tutorial(1l, "Test case 1", "For test case 1", true);
        when(tutorialService.findById(1l)).thenReturn(tutorial);

        mockMvc.perform(get("/api/tutorials/1"))
                .andExpect(status().isOk());
    }

    @Test
    void testCreateTutorial() throws Exception {
        Tutorial tutorial = new Tutorial(1l, "Test case 1", "For test case 1", true);
        Tutorial savedTutorial = new Tutorial(1l, "Test case 1", "For test case 1", true);
        when(tutorialService.saveTutorial(tutorial)).thenReturn(savedTutorial);

        mockMvc.perform(post("/api/tutorials")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\":\"Test case 1\",\"description\":\"For test case 1\",\"published\":true}"))
                .andExpect(status().isCreated());
    }

    @Test
    void testUpdateTutorial() throws Exception {
        Tutorial tutorial = new Tutorial(1l, "Test case 1", "For test case 1", true);
        Tutorial updatedTutorial = new Tutorial(1l, "Updated test case 1", "Updated for test case 1", false);
        when(tutorialService.findById(1l)).thenReturn(tutorial);
        when(tutorialService.saveTutorial(updatedTutorial)).thenReturn(updatedTutorial);

        mockMvc.perform(put("/api/tutorials/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"title\":\"Updated test case 1\",\"description\":\"Updated for test case 1\",\"published\":false}"))
                .andExpect(status().isOk());
    }

    @Test
    void testDeleteTutorial() throws Exception {
        doNothing().when(tutorialService).deleteById(1L);

        mockMvc.perform(delete("/api/tutorials/1"))
                .andExpect(status().isNoContent());
    }

    @Test
    void testDeleteAllTutorials() throws Exception {
        doNothing().when(tutorialService).deleteAll();

        mockMvc.perform(delete("/api/tutorials"))
                .andExpect(status().isNoContent());
    }

    @Test
    void testFindByPublished() throws Exception {
        List<Tutorial> tutorials = new ArrayList<>();
        tutorials.add(new Tutorial(1L, "Test case 1", "For test case 1", true));
        when(tutorialService.findByPublished(true)).thenReturn(tutorials);

        mockMvc.perform(get("/api/tutorials/published"))
                .andExpect(status().isOk());
    }
}