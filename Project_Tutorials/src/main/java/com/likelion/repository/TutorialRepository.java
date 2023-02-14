package com.likelion.repository;

import com.likelion.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean b);

    List<Tutorial> findByTitleContainingIgnoreCase(String title);
}
