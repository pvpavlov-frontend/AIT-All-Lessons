package ait.datesort.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {
    Comparator<String> dateComparator;

    @BeforeEach
    void setUp(){
        dateComparator = (s1, s2) -> {
            String[] arr1 = s1.split("-");
            String[] arr2 = s2.split("-");
            for (int i = arr1.length - 1; i >= 0; i--) {
                int d1 = Integer.parseInt(arr1[i]);
                int d2 = Integer.parseInt(arr2[i]);
                if (d1 > d2) {
                    return 1;
                }
                if (d1 < d2) {
                    return -1;
                }

            }
            return 0;
        };
    }

//    @BeforeEach
//    void setUp() {
//        dateComparator = (s1, s2) -> {
//            String pattern = "dd-MM-yyyy";
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
//            LocalDate date1 = LocalDate.parse(s1, formatter);
//            LocalDate date2 = LocalDate.parse(s2, formatter);
//            if (date1.compareTo(date2) < 0) {
//                return -1;
//            }
//            if (date1.compareTo(date2) > 0) {
//                return 1;
//            }
//            return 0;
//        };
//    }

    private void printArray(String[] origin) {
        for (int i = 0; i < origin.length; i++) {
            System.out.print(origin[i] + " ");
        }
        System.out.println();
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        printArray(dates);
        printArray(expected);
        Arrays.sort(dates, dateComparator);
        System.out.println("===================  dateComparator  =================");
        printArray(dates);
        printArray(expected);
        assertArrayEquals(expected, dates);

    }
}
