package model;

import model.impl.Car;
import model.impl.Scooter;
import service.ICarSharing;

import java.util.ArrayList;
import java.util.List;

public class CarSharing implements ICarSharing {
    ArrayList<Car> cars=new ArrayList<>();
    ArrayList<Scooter> scooters=new ArrayList<>();
    public CarSharing(ArrayList<Car> cars,ArrayList<Scooter> scooters){
        this.cars=cars;
        this.scooters=scooters;
    }
    @Override

    /* Get information about all cars */
    public void getAllCars() {

    }

    @Override
    /* Add new car and information about it */
    public void addCar() {

    }

    @Override
    /* Delete a car and information about it */
    public void deleteCar(){}
}
