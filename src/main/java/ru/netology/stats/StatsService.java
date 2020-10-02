package ru.netology.stats;

public class StatsService {
    public static int salesSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }
    public static int salesAverage( int[]purchases) {
      StatsService service = new StatsService();
      return StatsService.salesSum(purchases) / 12;
    }
    public static int maxSalesMonth (int[] purchases) {
        int month = 0;
        int max = 0;
        for (int i = 0; i < 12; i++) {
            if (purchases[i] >= max) {
                max = purchases[i];
                month = i + 1;
            }
        }
        return month;
    }
    public static int minSalesMonth (int[] purchases){
        int month = 0;
        int min = purchases[0];
        for (int i = 0; i < 12; i++) {
            if (purchases[i] <= min) {
                min = purchases[i];
                month = i + 1;
            }
        }
        return month;
    }
    public static int saleUnderAverage (int[] purchases){
    int averageSales = StatsService.salesSum(purchases) / 12;
    int quantity = 0;
    for (int i = 0; i < 12; i++) {
        if (purchases[i] < averageSales){
            quantity = quantity + 1;
        }
    }
        return quantity;
}

    public static int saleOverAverage (int[] purchases){
        int averageSales = StatsService.salesSum(purchases) / 12;
        int quantity = 0;
        for (int i = 0; i < 12; i++) {
            if (purchases[i] > averageSales){
                quantity = quantity + 1;
            }
        }
        return quantity;
    }
}




