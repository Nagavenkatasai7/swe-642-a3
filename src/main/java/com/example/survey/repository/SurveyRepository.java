package com.example.survey.repository;

import com.example.survey.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Survey entity.
 * Inherits methods for CRUD operations from JpaRepository.
 */
@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
    // Custom queries can be added here if necessary.
}
