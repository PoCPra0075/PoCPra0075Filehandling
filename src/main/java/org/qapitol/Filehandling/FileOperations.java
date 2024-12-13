package org.qapitol.Filehandling;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.*;
import java.io.*;
import java.util.*;

public class FileOperations {

//    public static void writeToTxt(String filename, String content) throws IOException {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
//            writer.write(content);
//            writer.newLine();
//        }
//    }
//    public static void readFromTxt(String filename) throws IOException {
//        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        }
//    }

    public static void writeToJson(String filename, Object data) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(filename), data);
    }

    public static void readFromJson(String filename) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Map<?, ?> map = mapper.readValue(new File(filename), Map.class);
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static void main(String[] args) throws IOException {
        // Student and Teacher Data
        Student student = new Student( 1, "Mathematics", 85, "Alice", 20);
        Teacher teacher = new Teacher( 101, "Bob", 35, "Physics", 50000);

        // TXT File
//        String txtFile = "data.txt";
//        writeToTxt(txtFile, "Student: " + student.getName() + ", Course: " + student.getCourse() + ", Marks: " + student.getMarks());
//        writeToTxt(txtFile, "Teacher: " + teacher.getName() + ", Subject: " + teacher.getSubject() + ", Salary: " + teacher.getSalary());
//        System.out.println("Reading from TXT:");
//        readFromTxt(txtFile);
//        System.out.println(txtFile.isEmpty());

        // JSON File
        String jsonFile = "data.json";
        Map<String, Object> jsonData = new HashMap<>();
        jsonData.put("Student", student);
        jsonData.put("Teacher", teacher);
        writeToJson(jsonFile, jsonData);
        System.out.println("\nReading from JSON:");
        readFromJson(jsonFile);
    }
}