package model.impl;

import model.Transport;

public class Car extends Transport {
    protected String carType;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Car(int id, float price, boolean isAvailible, String type, String carType) {
        super(id, price, isAvailible, type);
        this.carType = carType;
    }

    @Override
    public String getTransportInfo() {
        return super.getTransportInfo() +
            ", " + "carType: " + carType + " }";
    }
}
