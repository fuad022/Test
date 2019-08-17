package SaburovProject.edu.javacourse.studentorder.validator;

import SaburovProject.edu.javacourse.studentorder.domain.student.AnswerStudent;
import SaburovProject.edu.javacourse.studentorder.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student is running");
        return new AnswerStudent();
    }
}
