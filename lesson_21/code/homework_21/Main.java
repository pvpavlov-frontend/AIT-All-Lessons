package homework_21;

import java.util.Arrays;

import static homework_21.SortSelection.sortSelection;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 10, -2, 0};
        MyArrayUtils.sortBubble(numbers);
        System.out.println(Arrays.toString(numbers)); // => [-2, 0, 2, 3, 10]

        int[]sortArr={12,6,4,1,15,10};
        sortSelection(sortArr);
        System.out.println(Arrays.toString(sortArr)); // => [1, 4, 6, 10, 12, 15]
    }
}
