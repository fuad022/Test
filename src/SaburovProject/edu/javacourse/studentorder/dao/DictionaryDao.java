package SaburovProject.edu.javacourse.studentorder.dao;

import SaburovProject.edu.javacourse.studentorder.domain.CountryArea;
import SaburovProject.edu.javacourse.studentorder.domain.PassportOffice;
import SaburovProject.edu.javacourse.studentorder.domain.RegisterOffice;
import SaburovProject.edu.javacourse.studentorder.domain.Street;
import SaburovProject.edu.javacourse.studentorder.exception.DaoException;

import java.util.List;

public interface DictionaryDao {
    List<Street> findStreets(String pattern) throws DaoException;
    List<PassportOffice> findPassportOffices(String areaId) throws DaoException;
    List<RegisterOffice> findRegisterOffices(String areaId) throws DaoException;
    List<CountryArea> findAreas(String areaId) throws DaoException;
}
