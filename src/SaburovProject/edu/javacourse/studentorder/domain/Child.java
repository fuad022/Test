package SaburovProject.edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Child extends Person {
    private String certificateNumber;
    private LocalDate issueDate;
    private RegisterOffice issueDepart;

    public Child(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
        super(surName, givenName, patronymic, dateOfBirth);
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public RegisterOffice getIssueDepart() {
        return issueDepart;
    }

    public void setIssueDepart(RegisterOffice issueDepart) {
        this.issueDepart = issueDepart;
    }
}
