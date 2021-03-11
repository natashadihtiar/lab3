package service.impl;

import model.impl.Car;
import model.impl.Scooter;
import service.ICarSharing;

import java.util.ArrayList;
import java.util.List;

public class CarSharing implements ICarSharing {
    private List<Car> cars = new ArrayList<>();
    private List<Scooter> scooters = new ArrayList<>();
    private static int carIDS;
    private static int scooterIDS;

    public CarSharing(ArrayList<Car> cars, ArrayList<Scooter> scooters) {
        this.cars = cars;
        this.scooters = scooters;
    }

    @Override
    public List<Car> getAllCars() {
        return this.cars;
    }

    @Override
    public List<Scooter> getAllScooters() {
        return this.scooters;
    }

    @Override
    public void addCar(Car car) {
        car.setId(carIDS++);
        this.cars.add(car);
    }

    @Override
    public void deleteCar(int id) {
        this.cars.remove(id);
    }

    @Override
    public void addScooter(Scooter scooter) {
        scooter.setId(scooterIDS++);
        this.scooters.add(scooter);
    }

    @Override
    public void deleteScooter(int id) {
        this.scooters.remove(id);
    }

    @Override
    public void rentScooter(int id) {
        final Scooter scooter = this.scooters.get(id);
        if (scooter.isAvailible())
            scooter.setBusy();
        this.scooters.set(id, scooter);
    }

    @Override
    public void rentCar(int id) {
        final Car car = this.cars.get(id);
        if (car.isAvailible())
            car.setBusy();
        this.cars.set(id, car);
    }

    @Override
    public void returnScooter(int id) {
        this.scooters.get(id).setAvailable();
    }

    @Override
    public void returnCar(int id) {
        this.cars.get(id).setAvailable();
    }
}
