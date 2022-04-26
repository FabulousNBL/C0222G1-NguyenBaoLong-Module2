package casestudy.models.person;

public class Customer extends Person {
    private String idCustomer;
    private String customerType;

    public Customer(int idPerson,
                    String name,
                    String dateOfBirth,
                    String gender,
                    String address,
                    String email,
                    String phone,
                    String idCustomer,
                    String customerType) {
        super(idPerson, name, dateOfBirth, gender, address, email, phone);
        this.idCustomer = idCustomer;
        this.customerType = customerType;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return super.toString()+
                "idCustomer=" + idCustomer +
                ", customerType='" + customerType ;
    }
}
