package org.example;

import domain.Box;
import domain.Student;
import dto.DisplayStudentDto;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GenericClasses {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(234);
        Box<String> names = new Box<>();
        names.setContent("Anne");
        Box<Character> caracterBox = new Box<>();

        ArrayList<Student> students = new ArrayList<>();

        students.add(addStudent("Christine", "0789034567", 'A', "christine@gmail.com"));
        students.add(addStudent("Micheline", "0789024567", 'C', "michu@gmail.com"));
        students.add(addStudent("Daryce", "0789034537", 'D', "daryce@gmail.com"));
        students.add(addStudent("Henriette", "0785034567", 'B', "henriette@gmail.com"));
        students.add(addStudent("Florence", "0789734567", 'A', "florence@gmail.com"));
        students.add(addStudent("Chanelle", "0789634567", 'F', "chanelle@gmail.com"));

        displayStudents(students);

    }

    public static Student addStudent(String name, String phone, char grade, String email) {
        int id = (int) (Math.random()*100);
        LocalDateTime created = LocalDateTime.now();
        LocalDateTime updated = LocalDateTime.now();

        Student st1 = new Student( id, name, phone, grade, email, created, updated);
        return st1;
    }

//    public static ArrayList<DisplayStudentDto> displayStudents(ArrayList<Student> students) {
//        ArrayList<DisplayStudentDto> outputdata = new ArrayList<>();
//        for (Student st: students) {
//            DisplayStudentDto data = new DisplayStudentDto();
//            data.setId(st.getId());
//            data.setName(st.getName());
//            data.setEmail(st.getEmail());
//            data.setPhone(st.getPhone());
//            data.setGrade(st.getGrade());
//            outputdata.add(data);
//        }
//        return outputdata;
//    }

    public static ArrayList<DisplayStudentDto> displayStudents(ArrayList<Student> students) {
        ArrayList<DisplayStudentDto> outputdata = new ArrayList<>();
        for (Student st: students) {
            DisplayStudentDto data = new DisplayStudentDto();
            data.setId(st.getId());
            data.setName(st.getName());
            data.setEmail(st.getEmail());
            data.setPhone(st.getPhone());
            data.setGrade(st.getGrade());
            outputdata.add(data);
        }
        return outputdata;
    }
}
