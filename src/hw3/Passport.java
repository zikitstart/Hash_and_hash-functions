package hw3;

import utility.Utility;
import java.util.Objects;

public class Passport {

    private final String passportNumber;
    private String surname;
    private String name;
    private String middleName;
    private String dateOfBirth;


    public Passport(String passportNumber, String surname, String name, String middleName, String dateOfBirth) {
        this.passportNumber = Utility.checkNull(passportNumber ,"Default");
        this.surname = Utility.checkNull(surname ,"Default");
        this.name = Utility.checkNull(name ,"Default");
        this.middleName = middleName;
        this.dateOfBirth = Utility.checkNull(dateOfBirth ,"Default");
    }

    public String getPassportNumber() {
        return passportNumber;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setSurname(String surname) {
        this.surname = Utility.checkNull(surname ,"Default");
    }
    public void setName(String name) {
        this.name = Utility.checkNull(name ,"Default");
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = Utility.checkNull(dateOfBirth ,"Default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportNumber, passport.passportNumber) && Objects.equals(surname, passport.surname) && Objects.equals(name, passport.name) && Objects.equals(middleName, passport.middleName) && Objects.equals(dateOfBirth, passport.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber, surname, name, middleName, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Паспорт:{" +
                "Номер: " + passportNumber +
                "/ Фамилия: " + surname +
                "/ Имя: " + name +
                "/ Отчество: " + middleName +
                "/ Дата рождения: " + dateOfBirth +
                ".}";
    }
}
