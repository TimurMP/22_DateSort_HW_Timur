package telran.datesort.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
        Comparator<String> comparator = (d1,d2) -> 0;

        Arrays.sort(dates, comparator);

        assertArrayEquals(expected, dates);



    }
}