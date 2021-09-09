package com.seleniummaster.Json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.output.FileWriterWithEncoding;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonWriteDemo3 {
    public static void main(String[] args) {
        List<Api> apiCourses=new ArrayList<>();
        apiCourses.add(new Api("RestAssured-api_testing",50));
        apiCourses.add(new Api("Soup-UI_Webervices_testing",50));
        List<WebAutomation>webAutomationCourses=new ArrayList<>();
        webAutomationCourses.add(new WebAutomation("Selenium-Webdriver-Java",60));
        webAutomationCourses.add(new WebAutomation("Cypress",70));
        webAutomationCourses.add(new WebAutomation("BDD-Cucumber_Java",40));

        Courses courses=new Courses(webAutomationCourses,apiCourses);

        CourseInfo courseInfo=new CourseInfo("SDET training", "Automation",
                "Dolkun Tarim","https://www.linkedIn.com",
                "https://seleniummaster.teachable.com/",courses);
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            objectMapper.writeValue(new File("testdata/course-detail.json"),courseInfo);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
