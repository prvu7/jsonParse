package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.models.Student;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("src/main/resources/student.json");
        Student studentOutput = objectMapper.readValue(jsonFile, Student.class);

        System.out.println("Student name: " + studentOutput.getName());
        System.out.println("Student age: " + studentOutput.getAge());
        System.out.println("Student gender: " + studentOutput.getGender());
        System.out.println("Student Uni: " + studentOutput.getUniversity());

        Student studentInput = new Student();
        studentInput.setName("Mariah Smith");
        studentInput.setAge(22);
        studentInput.setGender("Female");
        studentInput.setUniversity("Cambridge");

        objectMapper.writeValue(jsonFile, studentInput);
    }
}