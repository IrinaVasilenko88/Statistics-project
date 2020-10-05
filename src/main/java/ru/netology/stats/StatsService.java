package ru.netology.stats;

public class StatsService {
    public static int salesSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }
    public int salesAverage( int[]purchases) {
      return StatsService.salesSum(purchases) / purchases.length;
    }
    public int maxSalesMonth (int[] purchases) {
        int month = 0;
        int max = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] >= max) {
                max = purchases[i];
                month = i + 1;
            }
        }
        return month;
    }
    public int minSalesMonth (int[] purchases){
        int month = 0;
        int min = purchases[0];
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] <= min) {
                min = purchases[i];
                month = i + 1;
            }
        }
        return month;
    }
    public int saleUnderAverage (int[] purchases){
    int averageSales = StatsService.salesSum(purchases) / purchases.length;
    int quantity = 0;
    for (int i = 0; i < purchases.length; i++) {
        if (purchases[i] < averageSales){
            quantity = quantity + 1;
        }
    }
        return quantity;
}

    public int saleOverAverage (int[] purchases){
        int averageSales = StatsService.salesSum(purchases) / purchases.length;
        int quantity = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > averageSales){
                quantity = quantity + 1;
            }
        }
        return quantity;
    }
}




