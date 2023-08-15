package homework_21;

class MyArrayUtils {
    // метод изменяет входящий массив items
    public static void sortBubble(int[] items) {
        var stepsCount = items.length - 1;
        // Объявляем переменную swapped, значение которой показывает был ли
        // совершен обмен элементов во время перебора массива
        boolean swapped;
        // do..while цикл. Работает почти идентично while
        // Разница в проверке. Тут она делается не до выполнения тела, а после
        // Такой цикл полезен там, где надо выполнить тело хотя бы раз в любом случае
        do {
            swapped = false;
            // Перебираем массив и меняем местами элементы, если предыдущий
            // больше, чем следующий
            for (var i = 0; i < stepsCount; i++) {
                if (items[i] > items[i + 1]) {
                    // temp – временная константа для хранения текущего элемента
                    var temp = items[i];
                    items[i] = items[i + 1];
                    items[i + 1] = temp;
                    // Если сработал if и была совершена перестановка,
                    // присваиваем swapped значение true
                    swapped = true;
                }
            }
            // Уменьшаем счетчик на 1, т.к. самый большой элемент уже находится
            // в конце массива
            stepsCount--;
        } while (swapped); // продолжаем, пока swapped == true
    }
}

