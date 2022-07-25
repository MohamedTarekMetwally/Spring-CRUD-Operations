package DAO;

import api.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> loadStudents();

    void saveStudent(Student student);

    Student getStudent(int id);
}
