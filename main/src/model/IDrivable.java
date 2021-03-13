package model;

public interface IDrivable {

    /* Allows users to get information about transport
    * return String type description*/
    String getTransportInfo();

    /* Allows users to rent a transport,
    * set available status as true */
    void setAvailable();

    /* Forbid users to rent a transport,
    * set available status as false */
    void setBusy();
    /*
    Sets unique identification as integer value
    to each instance
     */
    void setId(int id);
    /*
    Gets unique identification as integer value
    from each instance
     */
    int getId();
    /*
    Sets price to Transport instance,
    must be bigger than 0
     */
    void setPrice(float price);
    /*
    Gets price to Transport instance
     */
    float getPrice();
    /*
    Sets type as String value to Transport instance,
    describe  type of transport(car, cabriolet, SUV)
     */
    void setType(String type);
    /*
    Gets type as String value to Transport instance
     */
    String getType();
}
