package com.seleniummaster.Json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebAutomation {

    @JsonProperty("course title")
    private String courseTitle;
    @JsonProperty("price")
    private int prince;

    public WebAutomation() {
    }

    public WebAutomation(String courseTitle, int prince) {
        this.courseTitle = courseTitle;
        this.prince = prince;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getPrince() {
        return prince;
    }

    public void setPrince(int prince) {
        this.prince = prince;
    }
}
