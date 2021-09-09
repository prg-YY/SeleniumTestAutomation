package com.seleniummaster.Json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestResultObject {
    @JsonProperty("test-module")
    private String testModule;
    @JsonProperty("test-name")
    private String testName;
    @JsonProperty("test-data")
    private String testData;
    @JsonProperty("test-time")
    private String testTime;
    @JsonProperty("test-status")
    private Boolean testStatus;

    public TestResultObject() {
    }

    public TestResultObject(String testModule, String testName, String testData, String testTime, Boolean testStatus) {
        this.testModule = testModule;
        this.testName = testName;
        this.testData = testData;
        this.testTime = testTime;
        this.testStatus = testStatus;
    }

    public String getTestModule() {
        return testModule;
    }

    public void setTestModule(String testModule) {
        this.testModule = testModule;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestData() {
        return testData;
    }

    public void setTestData(String testData) {
        this.testData = testData;
    }

    public String getTestTime() {
        return testTime;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }

    public Boolean getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(Boolean testStatus) {
        this.testStatus = testStatus;
    }
}