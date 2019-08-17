package SaburovProject.edu.javacourse.studentorder.validator;

import SaburovProject.edu.javacourse.studentorder.domain.Person;
import SaburovProject.edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import SaburovProject.edu.javacourse.studentorder.domain.Child;
import SaburovProject.edu.javacourse.studentorder.domain.register.AnswerCityRegisterItem;
import SaburovProject.edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import SaburovProject.edu.javacourse.studentorder.domain.StudentOrder;
import SaburovProject.edu.javacourse.studentorder.exception.CityRegisterException;
import SaburovProject.edu.javacourse.studentorder.exception.TransportException;

import java.util.List;

public class CityRegisterValidator {
    public String hostName;
    protected int port;
    private String login;
    String password;

    public static final String IN_CODE = "NO_GRN";

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
//            for (int i = 0; i < so.getChildren().size(); i++) {
//                CityRegisterResponse cans = personChecker.checkPerson(children.get(i));
//            }
//
//            for (Iterator<Child> it = children.iterator(); it.hasNext();) {
//                Child child = it.next();
//                CityRegisterResponse cans = personChecker.checkPerson(child);
//            }
//        List<Child> children = so.getChildren();

        AnswerCityRegister ans = new AnswerCityRegister();

        ans.addItem(checkPerson(so.getHusband()));
        ans.addItem(checkPerson(so.getWife()));
        for (Child child : so.getChildren()) {
            ans.addItem(checkPerson(child));
        }

        return ans;
    }

    private AnswerCityRegisterItem checkPerson(Person person) {
        AnswerCityRegisterItem.CityStatus status = null;
        AnswerCityRegisterItem.CityError error = null;
        try {
            CityRegisterResponse tmp = personChecker.checkPerson(person);
            status = tmp.isExisting() ?
                    AnswerCityRegisterItem.CityStatus.YES :
                    AnswerCityRegisterItem.CityStatus.NO;
        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(ex.getCode(), ex.getMessage());
        } catch (TransportException ex) {
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(IN_CODE, ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(IN_CODE, ex.getMessage());
        }

        //////////////////////////////////////////////////////////////////////////////
//        if (ex instanceof CityRegisterException) {
//            CityRegisterException e = (CityRegisterException) ex;
//            error = new AnswerCityRegisterItem.CityError(e.getCode(), ex.getMessage());
//        }
//        if (ex instanceof TransportException) {
//            TransportException e = (TransportException) ex;
//            error = new AnswerCityRegisterItem.CityError(IN_CODE, ex.getMessage());
//        }
        ////////////////////////////////////////////////////////////////////////////////

        AnswerCityRegisterItem ans = new AnswerCityRegisterItem(status, person, error);

        return ans;
    }
}
