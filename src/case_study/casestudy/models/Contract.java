package casestudy.models;

import casestudy.models.person.Customer;

public class Contract {
    private Customer customer;
    private String idContract,deposit,totalFee;
    private Booking booking;

    public Contract(Customer customer, String idContract, String deposit, String totalFee, Booking booking) {
        this.customer = customer;
        this.idContract = idContract;
        this.deposit = deposit;
        this.totalFee = totalFee;
        this.booking = booking;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "customer=" + customer +
                ", idContract='" + idContract + '\'' +
                ", deposit='" + deposit + '\'' +
                ", totalFee='" + totalFee + '\'' +
                ", booking=" + booking +
                '}';
    }
}
