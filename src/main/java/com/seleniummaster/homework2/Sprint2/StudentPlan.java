package com.seleniummaster.homework2.Sprint2;

public class StudentPlan {
    private String title;
    private String description;

    public StudentPlan() {
    }

    public StudentPlan(String plan, String description) {
        this.title = plan;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
