package service;

import model.impl.Car;
import model.impl.Scooter;

import java.util.List;

public interface ICarSharing {

    /* Allows  to get information about all cars */
    List<Car> getAllCars();

    /* Allows  to get information about all scooters */
    List<Scooter> getAllScooters();

    /* Allows add new cars and information about them */
    void addCar(Car car);

    /* Allows to delete a chosen car */
    void deleteCar(int id);

    /* Allows add new scooter and information about them */
    void addScooter(Scooter scooter);

    /* Allows to delete a chosen scooter */
    void deleteScooter(int id);

    /* Makes scooter unavailable for renting
    * only if scooter is not busy*/
    void rentScooter(int id);

    /* Makes car unavailable for renting
    * only if car is not busy*/
    void rentCar(int id);

    /* Makes scooter available for renting*/
    void returnScooter(int id);

    /* Makes car available for renting*/
    void returnCar(int id);
}
