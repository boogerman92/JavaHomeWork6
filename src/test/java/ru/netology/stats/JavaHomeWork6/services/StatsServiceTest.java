package ru.netology.stats.JavaHomeWork6.services;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class StatsServiceTest {

    @Test
    public void mustCalcAmountSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.salesAmount(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldAverageSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAvr = 15;
        long actualAvr = service.averageSales(sales);

        Assertions.assertEquals(expectedAvr, actualAvr);
    }

    @Test
    public void maxSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMax = 6;
        long actualMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void minSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMin = 9;
        long actualMin = service.minSales(sales);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void numberOfMinMouth(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinMouth = 5;
        long actualMinMouth = service.numberOfMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedMinMouth, actualMinMouth);
    }

    @Test
    public void numberOfMaxMouth(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxMouth = 5;
        long actualMaxMouth = service.numberOfMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedMaxMouth, actualMaxMouth);
    }
}
