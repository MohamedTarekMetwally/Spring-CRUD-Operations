package service;

import DAO.StudentDAO;
import api.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> loadStudents() {

        List<Student> studentList = studentDAO.loadStudents();

        for(Student tempStudents : studentList){
            System.out.println(tempStudents);
        }
        System.out.println(studentList.size());

        return studentList;
    }

    @Override
    public void saveStudent(Student student) {

        if(student.getCountry().equalsIgnoreCase("egypt")){
            System.out.println("*********Mail sent to "+student.getName());
        }

        studentDAO.saveStudent(student);
    }

    @Override
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }
}
