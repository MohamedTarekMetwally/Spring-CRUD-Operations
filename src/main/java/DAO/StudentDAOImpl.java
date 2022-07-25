package DAO;

import api.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import rowmapper.StudentRowMapper;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Student> loadStudents() {
        String sql = "SELECT * FROM students";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }

    @Override
    public void saveStudent(Student student) {
        Object[] sqlParams = {student.getName(), student.getMobile(), student.getCountry()};

        String sql = "insert into students (name, mobile, country) VALUES (?,?,?)";

        jdbcTemplate.update(sql, sqlParams);

        System.out.println("1 record updated....");
    }

    @Override
    public Student getStudent(int id) {

        String sql= "SELECT * FROM STUDENTS WHERE ID = ?";

        return jdbcTemplate.queryForObject(sql,new StudentRowMapper(),id);
    }
}
