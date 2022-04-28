package case_study.casestudy.models.person;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private int idPerson;
    private String name, dateOfBirth;
    private String  phone;
    private String gender;
    private String address,email;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person() {
    }

    public Person(int idPerson,
                  String name,
                  String dateOfBirth,
                  String gender,
                  String address,
                  String email,
                  String phone) {
        this.idPerson = idPerson;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.email=email;
        this.phone=phone;
    }

    @Override
    public String toString() {
        return
                "idPerson=" + idPerson +
                ", name='" + name + '\'' +
                ", age=" + dateOfBirth +
                ", phone=" + phone +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ',';
    }
}
