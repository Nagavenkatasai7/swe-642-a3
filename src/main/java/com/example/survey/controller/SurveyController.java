package com.example.survey.controller;

import com.example.survey.model.Survey;
import com.example.survey.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing survey data.
 */
@RestController
@RequestMapping("/api/surveys")
@CrossOrigin(origins = "http://localhost:4200") // Allows Angular frontend calls
public class SurveyController {

    @Autowired
    private SurveyRepository surveyRepository;

    /**
     * GET /api/surveys - Retrieve all surveys.
     */
    @GetMapping
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    /**
     * POST /api/surveys - Create a new survey.
     */
    @PostMapping
    public Survey createSurvey(@RequestBody Survey survey) {
        return surveyRepository.save(survey);
    }

    /**
     * PUT /api/surveys/{id} - Update an existing survey.
     */
    @PutMapping("/{id}")
    public Survey updateSurvey(@PathVariable Long id, @RequestBody Survey surveyDetails) {
        Survey survey = surveyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Survey not found with id " + id));
        // Update each field with the new values from surveyDetails
        survey.setFirstName(surveyDetails.getFirstName());
        survey.setLastName(surveyDetails.getLastName());
        survey.setStreetAddress(surveyDetails.getStreetAddress());
        survey.setCity(surveyDetails.getCity());
        survey.setState(surveyDetails.getState());
        survey.setZip(surveyDetails.getZip());
        survey.setTelephone(surveyDetails.getTelephone());
        survey.setEmail(surveyDetails.getEmail());
        survey.setDateOfSurvey(surveyDetails.getDateOfSurvey());
        survey.setLikedCampus(surveyDetails.getLikedCampus());
        survey.setInterestSource(surveyDetails.getInterestSource());
        survey.setRecommendation(surveyDetails.getRecommendation());
        survey.setComments(surveyDetails.getComments());
        return surveyRepository.save(survey);
    }

    /**
     * DELETE /api/surveys/{id} - Delete a survey by ID.
     */
    @DeleteMapping("/{id}")
    public void deleteSurvey(@PathVariable Long id) {
        surveyRepository.deleteById(id);
    }
}
