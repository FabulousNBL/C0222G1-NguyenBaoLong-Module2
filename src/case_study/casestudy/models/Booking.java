package case_study.casestudy.models;


import case_study.casestudy.models.facility.Facility;
import case_study.casestudy.models.person.Customer;

import java.util.Objects;


public class Booking {
    private int idBooking ;
    private String idCustomer, idFacility, typeService,startDate,endDate;
//    private Customer customer;
//    private Facility facility;


    public Booking(int idBooking, String idCustomer, String idFacility, String typeService, String startDate, String endDate) {
        this.idBooking = idBooking;
        this.idCustomer = idCustomer;
        this.idFacility = idFacility;
        this.typeService = typeService;
        this.startDate = startDate;
        this.endDate = endDate;
    }



    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", idCustomer='" + idCustomer + '\'' +
                ", idFacility='" + idFacility + '\'' +
                ", typeService='" + typeService + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
