package homework_17;

public class Main {
    public static void main(String[] args) {
//  #1 Создать класс Car со следующими полями
//  (String brand, String color, String licensePlate,
//  MyDate registrationDate, Engine engine}

//   Обратите внимание, поля registrationDate и engine - это тоже объект.
//   Engine - содержмт информация о мощности двигателя
//   и о типе (бензин, дизель, электро).
//
//    Реализуйте метод toString в каждом классе.
//    Реализуйте метод конструктор в каждом классе.
//    Создайте два объекта автомобтля.
//  #2
//    В классе Engine добавте методы start и stop.
//    Кадлый из них пусть выводит строку "Engine is started"
//    "Engine is stoped". В классе Car добавте методы drive и stop.
//    Первый должкн заводить двигатель и писать, что такая то машина поехала.
//    Второй, соответственно глушить двигатель и останавливать машину.
//
//  #3 ** Реализовать проверку, если машина уже едет,
//  а я пытвюсь вызвать метод drive, должно появлятся сообщение, что машина уже едет.

        Car car1 = new Car("Mersedes", "black", "RE 1234 TR", new MyDate(2, 6, 2020), new Engine(250, "disel"));
        Car car2 = new Car("Audi", "white", "HB 4321 D", new MyDate(14, 05, 2023), new Engine(550, "gas"));

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();

        car1.stop();
        System.out.println();
//      ??? третью таску не совсем понял условие  ???
        if (car2.drive() != null){
            car2.drive();
        }else{
            System.out.println("машина уже едет!!!!!!!!!!!!!");
        }
    }
}
