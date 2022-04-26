package casestudy.models.person;

import java.io.Serializable;

public class Employee extends Person {
    private int  salary;
    private String education, position, idEmployee;

    public Employee(int idPerson,
                    String name,
                    String dateOfBirth,
                    String gender,
                    String address,
                    String email,
                    String phone,
                    String idEmployee,
                    int salary,
                    String education,
                    String position) {
        super(idPerson, name, dateOfBirth, gender, address, email, phone);
        this.idEmployee= idEmployee;
        this.salary = salary;
        this.education = education;
        this.position = position;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }



    @Override
    public String toString() {
        return
                super.toString()+
                "idEmployee=" + idEmployee +
                ", salary=" + salary +
                ", education='" + education + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
