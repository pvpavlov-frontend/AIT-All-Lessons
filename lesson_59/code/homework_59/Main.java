package homework_59;

import homework_01.src.Fruit;
import stream_api.src.Panda;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Iphone XR", 4.0, 520.00, "phone"),
                new Product("Iphone XR", 4.5, 420.00, "phone"),
                new Product("Iphone 14 Pro", 5.0, 810.00, "phone"),
                new Product("Iphone 11", 4.0, 300.00, "phone"),
                new Product("Iphone 11 Pro", 4.2, 330.00, "phone"),
                new Product("Lenovo ideapad", 3.8, 700.00, "laptop"),
                new Product("Fujitsu", 5.1, 990.00, "laptop"),
                new Product("Iphone 15", 5.5, 1250.00, "phone"),
                new Product("MakBook M1", 5.5, 2500.00, "laptop"),
                new Product("Iphone 7", 3.5, 200.00, "phone"),
                new Product("Iphone 6S", 2.0, 150.00, "phone")
        );

//        Задание 1
//        Получите лист товаров, которые стоят 200 евро или дешевле.
        List<Product> filteredPersons = products
                .stream()
                .filter(product -> product.getPrice() < 200)
                .toList();
//        System.out.println(filteredPersons);
//        Задание 2
//        Получите лист товаров, отсортированных по рейтингу
        List<Product> sortedProduct = products
                .stream()
                .sorted(
                        (p1, p2) -> Double.compare(p1.getRating(), p2.getRating())
                )
                .toList();
//        System.out.println(sortedProduct);
//        Задание 3
//        Проверьте есть ли в листе товаров, товар с названием: "Iphone XR"
        List<Product> findProduct = products
                .stream()
                .filter(p -> p.getTitle().equals("Iphone XR"))
                .toList();
//        System.out.println(findProduct);

//    4. Создайте новый лист товаров на основании старого,
//    пусть в новом листе рейтинг будет увеличен на 1
//    Товары в исходном листе **не должны** измениться.
        List<Product> newProducts = products
                .stream()
                // вариант с мапом - но для сайд эффектов можно использовать peek
//        .map(p -> {
//          p.setRating(p.getRating() + 1);
//          return p;
//        })
                .peek(p -> p.setRating(p.getRating() + 1)) // как forEach, но не терминальный
                .toList();
        System.out.println(products);

//  Задание 5 forEach
//  Измените цену товаров в исходном листе товаров: увеличьте ее на 20 евро. Товары в исходном листе должны измениться.
        products.forEach(Product::priceUp);
        System.out.println(products);
        //    Задание 6 reduce
//    Посчитайте общую стоимость всех товаров в листе.
        double totalPrice = products
                .stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);
        System.out.println(totalPrice);
    }

}
