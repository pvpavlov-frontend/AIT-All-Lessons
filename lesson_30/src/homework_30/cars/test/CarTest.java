package homework_30.cars.test;

import homework_30.cars.dao.Garage;
import homework_30.cars.dao.Garagelmpl;
import homework_30.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class CarTest {
    Garage garage;
    Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new Garagelmpl(5);
        cars = new Car[4];
        cars[0] = new Car("BH1234D", "320","BMW", 3.3, "black");
        cars[1] = new Car("CUX4444D", "550","BMW", 5.0, "white");
        cars[2] = new Car("BH6666D", "A6","AUDI", 2.8, "green");
        cars[3] = new Car("BH4321D", "220","Mersedes", 2.2, "white");
        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
            System.out.println(cars[i]);
        }


    }
    @Test
    void addCar() {
        assertFalse(garage.addCar(null));
//        assertFalse(garage.addCar(cars[1]));
//        Car car = new Car("BH1234D", "320","BMW", 3.3, "black");
//        assertTrue(garage.addCar(car));
//        assertEquals(4, garage.quantity());
//        car = new Car("D1234BH", "320","BMW", 3.3, "black");
//        assertFalse(garage.addCar(car));
    }


}
