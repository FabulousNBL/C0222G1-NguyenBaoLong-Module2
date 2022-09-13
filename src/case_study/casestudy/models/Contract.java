package case_study.casestudy.models;


public class Contract {
    private String customer,idContract;
    private int deposit,totalFee;
    private int idBooking;

    public Contract(String customer, String idContract, int deposit, int totalFee, int idBooking) {
        this.customer = customer;
        this.idContract = idContract;
        this.deposit = deposit;
        this.totalFee = totalFee;
        this.idBooking = idBooking;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "customer=" + customer +
                ", idContract='" + idContract + '\'' +
                ", deposit='" + deposit + '\'' +
                ", totalFee='" + totalFee + '\'' +
                ", booking=" + idBooking +
                '}';
    }
}
