package homework_35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    private List<Integer> arrNum1;
    private List<Integer> arrNum2;
    private List<Integer> arrNum3;
    @BeforeEach
    void SetUp(){
        arrNum1 = Arrays.asList(1,2,3,4);
        arrNum2 = Arrays.asList(5,2,3,8);
        arrNum3 = Arrays.asList(5, 2, 3, 6, 4, 1);
    }
    @Test
    void yesOrNoNumber(){
        List<String> expected = Arrays.asList("No","Yes","Yes","No");
        List<String> result = Main.yesOrNoNumber(arrNum1, arrNum2);
        assertEquals(expected, result);
    }

    @Test
    void testlistWithoutElementsGreaterNumber(){
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = Main.listWithoutElementsGreaterNumber(arrNum3, 5);
        assertEquals(expected, result);
    }
}
