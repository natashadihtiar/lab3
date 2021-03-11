package model;

public interface IDrivable {

    /* Allows users to get information about transport*/
    String getTransportInfo();

    /* Allows users to rent a transport */
    void setAvailable();

    /* Forbid users to rent a transport */
    void setBusy();
}
