package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }
    public long calculateAverage(long[] purchases) {

        long len = purchases.length;
        long sum=  calculateSum(purchases);
        long average = sum/len;
        return average;
    }
    public long calculateMax(long[] purchases) {
        long currentMax = purchases[0];
        long month = 0;
        for (int i=0; i<purchases.length; i++) {
            long purchase = purchases[i];
            if (currentMax<= purchase) {
                currentMax = purchase;
                month = i;
            }

        }
        return month+1;
    }
    public long calculateMin(long[] purchases) {
        long currentMin = purchases[0];
        long month = 0;
        for (int i=0; i<purchases.length; i++) {
            long purchase = purchases[i];
            if (currentMin> purchase) {
                currentMin = purchase;
                month = i;
            }
        }
        return month+1;
    }
    public long calculateBelowAverage(long[] purchases) {
        long average = calculateAverage(purchases);
        long countMonths = 0;
        for (long purchase : purchases) {
            if (purchase< average) {
                countMonths += 1;
            }
        }
        return countMonths;
    }
    public long calculateAboveAverage(long[] purchases) {
        long average = calculateAverage(purchases);
        long countMonths = 0;
        for (long purchase : purchases) {
            if (purchase< average) {
                countMonths += 1;
            }
        }
        return countMonths;
    }

}




