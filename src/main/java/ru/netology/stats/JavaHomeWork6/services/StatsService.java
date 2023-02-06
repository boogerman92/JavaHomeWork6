package ru.netology.stats.JavaHomeWork6.services;


public class StatsService {
    public int salesAmount(long[] sales){
        int sum = 0;
        for (int i = 0; i < sales.length; ++i) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        int sum = salesAmount(sales);
        int average = sum / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numberOfMonthsBelowAverage(long[] sales) {
        long average = averageSales(sales);
        int numberOfMounth = 0;
        for(long minM : sales){
            if(minM < average) {
                numberOfMounth++;
            }
        }
        return numberOfMounth;
    }

    public int numberOfMonthsAboveAverage(long[] sales) {
        long average = averageSales(sales);
        int numberOfMounth = 0;
        for(long maxM : sales){
            if(maxM > average) {
                numberOfMounth++;
            }
        }
        return numberOfMounth;
    }
}
