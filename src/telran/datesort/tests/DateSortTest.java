package telran.datesort.tests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class DateSortTest {


    @Test
    void test() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16/06/1970"
        };

        String[] expected = {
                "16/06/1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010",
        };
        Comparator<String> comparator = (d1, d2) -> 0;
        printArray(dates, "Before Sorting");

        Arrays.sort(dates, comparator);

        printArray(dates, "After Sorting:");

//        assertArrayEquals(expected, dates);


    }


    private void printArray(String[] arr, String title) {
        System.out.println(title);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\n");
    }
}