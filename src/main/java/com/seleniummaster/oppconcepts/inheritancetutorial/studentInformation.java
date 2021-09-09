package com.seleniummaster.oppconcepts.inheritancetutorial;




import java.util.ArrayList;
import java.util.List;

public class studentInformation {
    public static void main(String[] args) {
        Student student=new Student();
        student.setFirstName("bb");
        student.setLastname("bbb");

        GraduateStudent graduateStudent=new GraduateStudent();
        graduateStudent.setFirstName("kadir");
        graduateStudent.setLastname("abil");
        graduateStudent.setMajor("kassap");
        graduateStudent.setResearchField("Selenium test");

        System.out.println(graduateStudent.toString());

        GraduateStudent  graduateStudent1=new GraduateStudent();
        graduateStudent1.setFirstName("alim");
        graduateStudent1.setLastname("kalim");
        graduateStudent1.setMajor("doktur");
        graduateStudent1.setAdvisorName("dolkun");
        graduateStudent1.setResearchField("United coder");

        List<GraduateStudent> studentList=new ArrayList<>();
        studentList.add(graduateStudent);
        studentList.add(graduateStudent1);
        for (GraduateStudent  students:studentList){
            System.out.println(students.toString());
        }




    }
}
