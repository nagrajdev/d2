package f1.app.contract.student.invoke;

import f1.app.contract.student.logic.IStudent;
import f1.app.contract.student.logic.entity.Student;
import f1.app.contract.student.logic.entity.StudentResult;
import cn.hyperchain.contract.BaseInvoke;

public class InvokeIsContains implements BaseInvoke<StudentResult, IStudent> {

    private Student student;

    public InvokeIsContains() {}

    public InvokeIsContains(Student student) {
        this.student = student;
    }

    @Override public StudentResult invoke(IStudent iStudent) {
        return iStudent.isContains(student);
    }
}
