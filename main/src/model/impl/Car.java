package model.impl;

public class Car extends Transport {
    String carType;
    public Car(int id, float price, boolean isAvailible, String type,String carType) {
        super(id, price, isAvailible, type);
        this.carType=carType;
    }

    @Override

    /* Choose and rent a transport */
    public void setTransport() {

    }
}
