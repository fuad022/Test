package SaburovProject.edu.javacourse.studentorder.dao;

import SaburovProject.edu.javacourse.studentorder.domain.StudentOrder;
import SaburovProject.edu.javacourse.studentorder.exception.DaoException;

public interface StudentOrderDao {
    Long saveStudentOrder(StudentOrder so) throws DaoException;
}
