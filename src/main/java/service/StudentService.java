package service;

import api.Student;

import java.util.List;

public interface StudentService {
    List<Student> loadStudents();

    void saveStudent(Student student);

    Student getStudent(int id);
}
