package ru.netology.stats;



public class StatisticsService {
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int calculateAverageSum(int[] purchases) {
        int sum = (int) calculateSum(purchases);
        return sum / purchases.length;
    }

    public int findMaxMonth(int[] purchases) {
        int currentMax = (int) purchases[0];
        int numberOfMonth = 0;
        int findMaxMonth = 0;
        for (int purchase : purchases) {
            numberOfMonth += 1;
            if (currentMax <= purchase) {
                currentMax = purchase;
                findMaxMonth = numberOfMonth;
            }
        }
        return findMaxMonth;
    }

    public int findMinMonth(int[] purchases) {

        int currentMin = purchases[0];
        int numberOfMonth = 0;
        int findMinMonth = 0;
        for (int purchase : purchases) {
            numberOfMonth += 1;
            if (currentMin >= purchase) {
                currentMin = purchase;
                findMinMonth = numberOfMonth;
            }
        }
        return findMinMonth;
    }

    public int minAvgMonthPurchse(int[] purchases) {
        int minAvgMonthPurchse = 0;
        int avg = (int) calculateAverageSum(purchases);
        for (int purchase : purchases) {
            if (purchase < avg) {
                minAvgMonthPurchse += 1;
            }
        }
        return minAvgMonthPurchse;
    }

    public int maxAvgMonthPurchase(int[] purchases) {
        int maxAvgMonthPurchase = 0;
        int avg = (int) calculateAverageSum(purchases);
        for (int purchase : purchases) {
            if (purchase > avg) {
                maxAvgMonthPurchase += 1;
            }
        }
        return maxAvgMonthPurchase;
    }

}