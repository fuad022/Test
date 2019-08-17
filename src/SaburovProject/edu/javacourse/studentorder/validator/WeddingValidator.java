package SaburovProject.edu.javacourse.studentorder.validator;

import SaburovProject.edu.javacourse.studentorder.domain.wedding.AnswerWedding;
import SaburovProject.edu.javacourse.studentorder.domain.StudentOrder;

public class WeddingValidator {
    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }
}
