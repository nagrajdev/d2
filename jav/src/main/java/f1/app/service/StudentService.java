package f1.app.service;

import f1.app.contract.student.logic.entity.Student;

import f1.app.contract.student.logic.entity.StudentResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    boolean registerStudent(Student student);
    boolean changeStudent(Student student);
    Student getStudent(String id);
    List<Student> getStudents(List<String> ids);
    StudentResult isContains(Student student);
}
