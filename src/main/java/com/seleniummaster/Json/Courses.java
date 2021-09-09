package com.seleniummaster.Json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Courses {
    @JsonProperty("webAutomation")
    private List<WebAutomation> webAutomation;
    @JsonProperty("Api")
    private List<Api> api;

    public Courses() {
    }

    public Courses(List<WebAutomation> webAutomation, List<com.seleniummaster.Json.Api> api) {
        this.webAutomation = webAutomation;
        this.api = api;
    }

    public List<WebAutomation> getWebAutomation() {
        return webAutomation;
    }

    public void setWebAutomation(List<WebAutomation> webAutomation) {
        this.webAutomation = webAutomation;
    }

    public List<com.seleniummaster.Json.Api> getApi() {
        return api;
    }

    public void setApi(List<com.seleniummaster.Json.Api> api) {
        this.api = api;
    }
}
