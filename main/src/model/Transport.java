package model;

/*  It is an abstract class that implements IDrivable.
 *  Represents basic information about car */
public abstract class Transport implements IDrivable {
    protected int id;
    protected float price;
    protected boolean isAvailible;
    protected String type;

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
        if(price < 0)
            throw new RuntimeException("Price must be much than 0");
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
    public String toString() {
        return "Transport{" +
            "id=" + id +
            ", price=" + price +
            ", isAvailible=" + isAvailible +
            ", type='" + type + '\'';
    }

    @Override
    public String getTransportInfo() {
        return this.toString();
    }

    @Override
    public void setAvailable() {
        this.isAvailible = true;
    }

    @Override
    public void setBusy() {
        this.isAvailible = false;
    }

}
