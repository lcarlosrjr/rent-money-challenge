package br.luiz.rent.money.challenge.entity;

import java.time.LocalDate;

public class RentMoney {

    private int id;
    private Client client;
    private double rentValue;
    private LocalDate rentFirstParcelDate;
    private int parcelQuantity;

    public RentMoney() {
    }

    public RentMoney(Client client, double rentValue, LocalDate rentFirstParcelDate, int parcelQuantity) {
        this.client = client;
        this.rentValue = rentValue;
        this.rentFirstParcelDate = rentFirstParcelDate;
        this.parcelQuantity = parcelQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getRentValue() {
        return rentValue;
    }

    public void setRentValue(double rentValue) {
        this.rentValue = rentValue;
    }

    public LocalDate getRentFirstParcelDate() {
        return rentFirstParcelDate;
    }

    public void setRentFirstParcelDate(LocalDate rentFirstParcelDate) {
        this.rentFirstParcelDate = rentFirstParcelDate;
    }

    public int getParcelQuantity() {
        return parcelQuantity;
    }

    public void setParcelQuantity(int parcelQuantity) {
        this.parcelQuantity = parcelQuantity;
    }

}
