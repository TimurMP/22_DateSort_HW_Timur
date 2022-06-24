package telran.datesort.tests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DateSortTest {


    @Test
    void test1() {
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

        Comparator<String> comparator = (d1, d2) -> {
            int compareYear = d1.substring(6, 10).compareTo(d2.substring(6,10));
            int compareMonth = d1.substring(3, 5).compareTo(d2.substring(3,5));
            int compareDay = d1.substring(0, 2).compareTo(d2.substring(0,2));

            if (compareYear < 0){
                return -1;
            }
            if (compareMonth < 0 && compareYear ==0){
                return -1;
            }
            if (compareDay < 0 && compareMonth ==0){
                return -1;
            }
            return 0;
        };

        printArray(dates, "Before Sorting");
        Arrays.sort(dates, comparator);
        printArray(dates, "After Sorting:");
        printArray(expected, "Expected:");
        assertArrayEquals(expected, dates);

//        System.out.println(dateParser("15-11-2010",0, 2));

    }


    @Test
    void testLonger () {


        String[] dates = {
                "12/23/2020",
                "11/04/2031",
                "07-05-1990",
                "28-01-2010",
                "25/12/2029",
                "08/12/2029",
                "05/28/2022",
                "11/03/2031",
                "11-08-1990",
                "15-01-2010",
                "16/06/1971"
        };

        String[] expected = {
                "16/06/1971",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010",
                "12/23/2020",
                "05/28/2022",
                "08/12/2029",
                "25/12/2029",
                "11/03/2031",
                "11/04/2031",

        };
        Comparator<String> comparator = (d1, d2) -> {
            int compareYear = d1.substring(6, 10).compareTo(d2.substring(6,10));
            int compareMonth = d1.substring(3, 5).compareTo(d2.substring(3,5));
            int compareDay = d1.substring(0, 2).compareTo(d2.substring(0,2));

            if (compareYear < 0){
                return -1;
            }
            if (compareMonth < 0 && compareYear ==0){
                return -1;
            }
            if (compareDay < 0 && compareMonth ==0){
                return -1;
            }
            return 0;
        };

        printArray(dates, "Before Sorting");
        Arrays.sort(dates, comparator);
        printArray(dates, "After Sorting:");
        printArray(expected, "Expected:");
        assertArrayEquals(expected, dates);

    }

    private String dateParser(String date, int indexA, int indexB){
        return date.substring(indexA, indexB);

    }



    private void printArray(String[] arr, String title) {
        System.out.println(title);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\n");
    }
}