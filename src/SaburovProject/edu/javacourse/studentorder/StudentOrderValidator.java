package SaburovProject.edu.javacourse.studentorder;

import SaburovProject.edu.javacourse.studentorder.domain.*;
import SaburovProject.edu.javacourse.studentorder.domain.children.AnswerChildren;
import SaburovProject.edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import SaburovProject.edu.javacourse.studentorder.domain.student.AnswerStudent;
import SaburovProject.edu.javacourse.studentorder.domain.wedding.AnswerWedding;
import SaburovProject.edu.javacourse.studentorder.mail.MailSender;
import SaburovProject.edu.javacourse.studentorder.validator.ChildrenValidator;
import SaburovProject.edu.javacourse.studentorder.validator.CityRegisterValidator;
import SaburovProject.edu.javacourse.studentorder.validator.StudentValidator;
import SaburovProject.edu.javacourse.studentorder.validator.WeddingValidator;

import java.util.LinkedList;
import java.util.List;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    public void checkAll() {
        List<StudentOrder> soList = readStudentOrders();
//        for (int c = 0; c < soList.length; c++) {
//            System.out.println();
//            checkOneOrder(soList[c]);
//        }

        for (StudentOrder so : soList) {
            checkOneOrder(so);
        }
    }

    public List<StudentOrder> readStudentOrders() {
        List<StudentOrder> soList = new LinkedList<>();
        for (int c = 0; c < 5; c++) {
            StudentOrder so = SaveStudentOrder.buildStudentOrder(c);
            soList.add(so);
        }
        return soList;
    }

    public void checkOneOrder(StudentOrder so) {
        AnswerCityRegister cityAnswer = checkCityRegister(so);
//        AnswerWedding wedAnswer = checkWedding(so);
//        AnswerChildren childAnswer = checkChildren(so);
//        AnswerStudent studAnswer = checkStudent(so);

//        sendMail(so);
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}
