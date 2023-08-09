package homework_17;

public class Car {
    String brand;
    String color;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;

    public Car(String brand, String color,String licensePlate, MyDate registrationDate, Engine engine){
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.registrationDate = registrationDate;
        this.engine = engine;
    }

    public String toString(){
        return "Brand: " +  brand + "\n" + "Color: " + color + "\n" +  "LicensePlate: " + licensePlate + "\n" + "RegistrationDate: " + registrationDate + "\n" + "Engine: "+ "\n" + engine;
    }
    public String drive(){
        engine.start();
        System.out.println( brand +": "+ "Car go!!!");
        return null;
    }
    public void stop(){
        engine.stop();
        System.out.println( brand +": "+ "Car is stoped!!!");
    }
}
