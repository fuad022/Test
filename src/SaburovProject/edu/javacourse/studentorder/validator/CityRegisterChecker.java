package SaburovProject.edu.javacourse.studentorder.validator;

import SaburovProject.edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import SaburovProject.edu.javacourse.studentorder.domain.Person;
import SaburovProject.edu.javacourse.studentorder.exception.CityRegisterException;
import SaburovProject.edu.javacourse.studentorder.exception.TransportException;

public interface CityRegisterChecker {
    CityRegisterResponse checkPerson(Person person) throws CityRegisterException, TransportException;
}
