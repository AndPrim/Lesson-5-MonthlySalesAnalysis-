package ru.netology.stats.MonthlySalesAnalysis.StatsService;

public class StatsService {

    public int salesAmount(int[] arrMonth) {
        /*arrMonth = new int[]{
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };*/
        int sumSales = 0;
        for (int i = 0; i < arrMonth.length; i++) {
            sumSales += arrMonth[i];
        }
        return sumSales;
    }

    public int averageSalesAmount(int[] arrMonth) {
        int averageAmount = salesAmount(arrMonth) / 12;
        return averageAmount;
    }

    public int maxSales(int[] arrMonth) {
        int monthMax = 0;
        /*arrMonth = new int[]{
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };*/
        for (int i = 0; i < arrMonth.length; i++) {
            if (arrMonth[i] >= arrMonth[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int minSales(int[] arrMonth) {
        int monthMin = 0;
        /*arrMonth = new int[]{
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };*/
        for (int i = 0; i < arrMonth.length; i++) {
            if (arrMonth[i] <= arrMonth[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int badMonth(int[] arrMonth){
        int averageIndex = averageSalesAmount(arrMonth);
        int monthBadSales = 0;
        /*arrMonth = new int[]{
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };*/
        for (int i = 0; i < arrMonth.length; i++){
            if (arrMonth[i] < averageIndex){
                monthBadSales++;
            }
        }
        return monthBadSales;
    }

    public int goodMonth(int[] arrMonth){
        int averageIndex = averageSalesAmount(arrMonth);
        int monthGoodSales = 0;
        /*arrMonth = new int[]{
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };*/
        for (int i = 0; i < arrMonth.length; i++){
            if (arrMonth[i] > averageIndex){
                monthGoodSales++;
            }
        }
        return monthGoodSales;
    }
}
