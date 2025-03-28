package com.example.survey.model;

import jakarta.persistence.*;
import java.util.Date;

/**
 * Survey entity class.
 * Maps to the 'surveys' table and contains all fields for survey data.
 */
@Entity
@Table(name = "surveys")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Personal details fields
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String telephone;
    private String email;

    // Survey-specific fields
    @Temporal(TemporalType.DATE)
    private Date dateOfSurvey;      // Date of survey submission

    // Stores comma-separated values if more than one option is selected (e.g., "students,campus")
    private String likedCampus;
    // Source through which the student learned about the university (e.g., "friends")
    private String interestSource;
    // Likelihood of recommendation (e.g., "Very Likely")
    private String recommendation;
    // Additional comments from the student
    private String comments;

    // Getters and setters for each field

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDateOfSurvey() {
        return dateOfSurvey;
    }
    public void setDateOfSurvey(Date dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }
    public String getLikedCampus() {
        return likedCampus;
    }
    public void setLikedCampus(String likedCampus) {
        this.likedCampus = likedCampus;
    }
    public String getInterestSource() {
        return interestSource;
    }
    public void setInterestSource(String interestSource) {
        this.interestSource = interestSource;
    }
    public String getRecommendation() {
        return recommendation;
    }
    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
}
