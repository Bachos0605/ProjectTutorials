package com.likelion.repository;

import com.likelion.entity.Tutorial;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class TutorialRepositoryTest {

    @Autowired
    private TutorialRepository tutorialRepository;

    @AfterEach
    void tearDown() {
        tutorialRepository.deleteAll();
    }

    @Test
    void testFindByPublished() {
        List<Tutorial> afterSaved = tutorialRepository.findByPublished(true);
        assertThat(afterSaved).isNotNull();
    }

    @Test
    void testfindByTitleContainingIgnoreCase() {
        List<Tutorial> afterSaved = tutorialRepository.findByTitleContainingIgnoreCase("test");
        assertThat(afterSaved).isNotNull();
    }
}
