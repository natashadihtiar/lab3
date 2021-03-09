package model.impl;

import service.IDrivable;

/*  It is an abstract class that implements IDrivable.
 *  Represents basic information about car */


public  abstract class Transport implements IDrivable {
int id;
float price;
boolean isAvailible;
String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isAvailible() {
        return isAvailible;
    }

    public void setAvailible(boolean availible) {
        isAvailible = availible;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Transport(int id, float price, boolean isAvailible, String type) {
        this.id = id;
        this.price = price;
        this.isAvailible = isAvailible;
        this.type = type;
    }

    @Override

    /* Get information about car */
    public void getTransportInfo() {

    }
}
