package ru.netology.stats.test;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void salesSum() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        {
            int sum = 0;
            for (int purchase : purchases) {
                sum += purchase;
            }
            int expected = 180;
            int actual = sum;
            assertEquals(expected, actual);
        }
    }

    @Test
    void salesAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        {
            StatsService service = new StatsService();
            int averageSales = StatsService.salesSum(purchases) / 12;
            int expected = 15;
            int actual = averageSales;
            assertEquals(expected, averageSales);
        }
    }

    @Test
    void maxSalesMonth() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        {
            int month = 0;
            int max = 0;
            for (int i = 0; i < 12; i++) {
                if (purchases[i] >= max) {
                    max = purchases[i];
                    month = i + 1;
                }
            }
            int expected = 8;
            int actual = month;
            assertEquals(expected, actual);
        }
    }

    @Test
    void minSalesMonth() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        {
            int month = 0;
            int min = purchases[0];
            for (int i = 0; i < 12; i++) {
                if (purchases[i] < min) {
                    min = purchases[i];
                    month = i + 1;
                }
            }
            int expected = 9;
            int actual = month;
            assertEquals(expected, actual);
        }
    }

    @Test
    void saleUnderAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        {
int averageSales = StatsService.salesSum(purchases) / 12;
            int quantity = 0;
            for (int i = 0; i < 12; i++) {
                if (purchases[i] < averageSales) {
                    quantity = quantity + 1;
                }
            }
                int expected = 5;
                int actual = quantity;
                assertEquals(expected, actual);

        }
    }
    @Test
    void saleOverAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        {
            int averageSales = StatsService.salesSum(purchases) / 12;
            int quantity = 0;
            for (int i = 0; i < 12; i++) {
                if (purchases[i] > averageSales) {
                    quantity = quantity + 1;
                }
            }
            int expected = 5;
            int actual = quantity;
            assertEquals(expected, actual);

        }
    }
}
