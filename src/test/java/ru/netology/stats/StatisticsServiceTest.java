package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatisticsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatisticsService service = new StatisticsService();

    @Test
    void shouldCalculateSum() {
        int sum = service.calculateSum(purchases);
        int actual = service.calculateSum(purchases);
        int expected = 180;
        System.out.println(sum);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSum() {
        int averageSum = service.calculateAverageSum(purchases);
        int actual = service.calculateAverageSum(purchases);
        int expected = 15;
        System.out.println(averageSum);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMaxPurchase() {
        int findMaxMonth = service.findMaxMonth(purchases);
        int actual = service.findMaxMonth(purchases);
        int expected = 8;
        System.out.println(findMaxMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMinPurchase() {
        int findMinMonth = service.findMinMonth(purchases);
        int actual = service.findMinMonth(purchases);
        int expected = 9;
        System.out.println(findMinMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithLowerThenAverageMonthPurchse() {
        int minAvgMonthPurchse = service.minAvgMonthPurchse(purchases);
        int actual = service.minAvgMonthPurchse(purchases);
        int expected = 5;
        System.out.println(minAvgMonthPurchse);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithHigherThenAverageMonthPurchase() {
        int maxAvgMonthPurchase = service.maxAvgMonthPurchase(purchases);
        int actual = service.maxAvgMonthPurchase(purchases);
        int expected = 5;
        System.out.println(maxAvgMonthPurchase);
        assertEquals(expected, actual);
    }
}