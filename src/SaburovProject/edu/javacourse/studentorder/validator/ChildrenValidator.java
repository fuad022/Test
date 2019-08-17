package SaburovProject.edu.javacourse.studentorder.validator;

import SaburovProject.edu.javacourse.studentorder.domain.children.AnswerChildren;
import SaburovProject.edu.javacourse.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children is running");
        return new AnswerChildren();
    }
}
