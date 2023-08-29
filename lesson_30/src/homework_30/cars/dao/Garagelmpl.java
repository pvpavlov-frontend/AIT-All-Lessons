package homework_30.cars.dao;

import homework_30.cars.model.Car;

import java.util.function.Predicate;

public class Garagelmpl implements Garage {
    private Car[] cars;
    private int size;

    public Garagelmpl(int capacity) {
        cars = new Car[capacity];
    }
    @Override
    public boolean addCar(Car car){
        if (car == null || cars.length == size /*|| findCarByRegNumber(car.getRegNumber() != null*/) {
            return false;
        }
        cars[size] = car;
        size++;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
        if (cars[i].getRegNumber() == regNumber) {
            Car victim = cars[i];
            cars[i] = cars[size - 1];
            cars[size - 1] = null;
            size--;
            return victim;
        }
    }

        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber() == regNumber) {
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        Predicate<Car> predicate = new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getModel() == model;
            }
        };
        return findCarsByColorPredicate(predicate);
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        Predicate<Car> predicate = new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getCompany() == company;
            }
        };
        return findCarsByColorPredicate(predicate);
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        Predicate<Car> predicate = new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getEngine() >= min && car.getEngine() < max;
            }
        };
        return findCarsByColorPredicate(predicate);
    }

    @Override
    public Car[] findCarsByColor(String color) {
        Predicate<Car> predicate = new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getColor() == color;
            }
        };
        return findCarsByColorPredicate(predicate);
    }

    @Override
    public int quantity() {
        return size;
    }
    private Car[] findCarsByColorPredicate(Predicate<Car> predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (predicate.test(cars[i])) {
                res[j] = cars[i];
                j++;
            }
        }
        return res;
    }
}
