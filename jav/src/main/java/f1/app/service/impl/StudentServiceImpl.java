package f1.app.service.impl;

import f1.app.contract.student.logic.entity.Student;
import f1.app.contract.student.logic.entity.StudentResult;
import f1.app.dao.StudentContractDao;
import f1.app.service.StudentService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentContractDao studentContractDao;


    @Override public boolean registerStudent(Student student) {
        // get Contract Address
        List<Student> students = new ArrayList<>();
        students.add(student);

        return studentContractDao.registerStudent(students);
    }

    @Override
    public boolean changeStudent(Student student) {
        return studentContractDao.changeStudent(student);
    }

    @Override
    public Student getStudent(String id) {
        return studentContractDao.getStudent(id);
    }

    @Override
    public List<Student> getStudents(List<String> ids) {
        return studentContractDao.getStudents(ids);
    }

    @Override
    public StudentResult isContains(Student student) {
        return studentContractDao.isContains(student);
    }

}
