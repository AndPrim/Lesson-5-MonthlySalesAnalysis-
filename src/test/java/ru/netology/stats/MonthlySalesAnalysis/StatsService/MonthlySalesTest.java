package ru.netology.stats.MonthlySalesAnalysis.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthlySalesTest {

    @Test
    void theAmountOfSalesForTheYear() {
        StatsService service = new StatsService();
        int[] arrMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSalesYear = 180;
        int actualSalesYear = service.salesAmount(arrMonth);

        Assertions.assertEquals(expectedSalesYear, actualSalesYear);
    }

    @Test
    void averageMonthlySalesDuringTheYear() {
        StatsService service = new StatsService();
        int[] arrMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageMonthlySales = 15;
        int actualAverageMonthlySales = service.averageSalesAmount(arrMonth);

        Assertions.assertEquals(expectedAverageMonthlySales, actualAverageMonthlySales);
    }

    @Test
    void theLastMonthOfBigSales() {
        StatsService service = new StatsService();
        int[] arrMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBigSalesMonth = 8;
        int actualBigSalesMonth = service.maxSales(arrMonth);

        Assertions.assertEquals(expectedBigSalesMonth, actualBigSalesMonth);
    }

    @Test
    void theLastMonthOfMiniSales() {
        StatsService service = new StatsService();
        int[] arrMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMiniSalesMonth = 9;
        int actualMiniSalesMonth = service.minSales(arrMonth);

        Assertions.assertEquals(expectedMiniSalesMonth, actualMiniSalesMonth);
    }

    @Test
    void theSumOfMonthsOfBadSales() {
        StatsService service = new StatsService();
        int[] arrMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expecteSumMonthBadSales = 5;
        int actualSumMonthBadSales = service.badMonth(arrMonth);

        Assertions.assertEquals(expecteSumMonthBadSales, actualSumMonthBadSales);
    }

    @Test
    void theSumOfMonthsOfGoodSales() {
        StatsService service = new StatsService();
        int[] arrMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expecteSumMonthGoodSales = 5;
        int actualSumMonthGoodSales = service.goodMonth(arrMonth);

        Assertions.assertEquals(expecteSumMonthGoodSales, actualSumMonthGoodSales);
    }
}
