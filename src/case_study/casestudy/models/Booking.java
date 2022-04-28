package case_study.casestudy.models;


import case_study.casestudy.models.facility.Facility;
import case_study.casestudy.models.person.Customer;

import java.util.Objects;


public class Booking {
    private int idBooking ;
    private String idCustomer, serviceName, typeService,startDate,endDate;
    private Customer customer;
    private Facility facility;

    public Booking(int idBooking, Customer customer, Facility facility, String startDate, String endDate) {
        this.idBooking = idBooking;
         this.customer=customer;
      this.facility=facility;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return idBooking == booking.idBooking;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBooking);
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public CharSequence getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", idCustomer='" + customer.getIdCustomer() + '\'' +
                ", serviceName='" + facility.getNameService() + '\'' +
                ", typeService='" + facility.getRentType() + '\'' +
                '}';
    }
}
