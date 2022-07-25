package controllers;

import api.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.StudentService;


import java.util.List;
import java.util.Objects;

@Controller
public class StudentController {
    private StudentService studentService;

    @Autowired
    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/showStudent")
    public String showStudentList(Model model){
        List<Student> students = studentService.loadStudents();
        model.addAttribute("students",students);

        return "student-list";
    }

    @GetMapping("/showAddStudentPage")
    public String addStudent(Model model){

        Student studentDTO = new Student();
        model.addAttribute("student",studentDTO);

        return "add-student";
    }

    @PostMapping("/save-student")
    public String saveStudent(Student studentDTO){

        System.out.println(studentDTO);
        studentService.saveStudent(studentDTO);

        return "redirect:/showStudent";
    }

    @GetMapping("/updateStudent")
    public String updateStudent(@RequestParam("UserId") int id, @ModelAttribute("student") Student student){

        System.out.println("Editing data in the student with id :"+id);
        Student myStudent = studentService.getStudent(id);
        System.out.println(myStudent);

        student.setId(myStudent.getId());
        student.setName(myStudent.getName());
        student.setMobile(myStudent.getMobile());
        student.setCountry(myStudent.getCountry());

        return "add-student";
    }
}