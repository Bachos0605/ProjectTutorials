package com.likelion.service;

import com.likelion.entity.Tutorial;
import com.likelion.repository.TutorialRepository;
import com.likelion.service.impl.TutorialServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TutorialServiceTest {
    @Mock
    private TutorialRepository tutorialRepository;

    @InjectMocks
    private TutorialServiceImpl tutorialService;

    @Test
    void testfindById() {
        when(tutorialRepository.findById(1l)).thenReturn(Optional.of(new Tutorial()));
        Tutorial afterSaved = tutorialService.findById(1l);
        assertNotNull(afterSaved);
    }
    @Test
    void testfindAll() {
        Tutorial tutorial1 = new Tutorial(1l,"Test case 1", "For test case 1", true);
        Tutorial tutorial2 = new Tutorial(2l, "Test case 2", "For test case 2", false);
         List<Tutorial> tutorialList = Arrays.asList(tutorial1, tutorial2);
         when(tutorialRepository.findAll()).thenReturn(tutorialList);

         List<Tutorial> result = tutorialService.findAll();
         assertNotNull(result);
         assertEquals(2, result.size());
         assertEquals(1l, result.get(0).getId());
         assertEquals("Test case 1", result.get(0).getTitle());
         assertEquals("For test case 1", result.get(0).getDescription());
         assertEquals(true, result.get(0).isPublished());
         assertEquals(2l, result.get(1).getId());
         assertEquals("Test case 2", result.get(1).getTitle());
         assertEquals("For test case 2", result.get(1).getDescription());
         assertEquals(false, result.get(1).isPublished());
    }

    @Test
    void testfindByTitleContaining() {
        when(tutorialRepository.findByTitleContainingIgnoreCase("title")).thenReturn(new ArrayList<Tutorial>());
        List<Tutorial> afterSaved = tutorialService.findByTitleContaining("title");
        assertNotNull(afterSaved);
    }

    @Test
    void testdeleteById() {
        Long id = 1L;
        tutorialService.deleteById(id);
        verify(tutorialRepository, times(1)).deleteById(id);
    }

    @Test
    void testdeleteAll() {
        tutorialService.deleteAll();
        verify(tutorialRepository, times(1)).deleteAll();
    }

    @Test
    void testfindByPublished() {
        when(tutorialRepository.findByPublished(true)).thenReturn(new ArrayList<Tutorial>());
        List<Tutorial> afterSaved = tutorialService.findByPublished(true);
        assertNotNull(afterSaved);
    }

    @Test
    void saveTutorial() {
        Tutorial tutorial = new Tutorial();
        tutorial.setId(1l);
        tutorial.setTitle("Test case 1");
        tutorial.setTitle("Test case 1");
        tutorial.setDescription("For test case 1");
        tutorial.setPublished(true);

        tutorialService.saveTutorial(tutorial);

        verify(tutorialRepository, times(1)).save(tutorial);
    }
}