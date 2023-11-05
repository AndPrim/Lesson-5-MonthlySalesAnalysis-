import ru.netology.stats.MonthlySalesAnalysis.StatsService.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] arrMonth = new int[12];
        System.out.println(service.salesAmount(arrMonth));
        System.out.println(service.averageSalesAmount(arrMonth));
        System.out.println(service.maxSales(arrMonth));
        System.out.println(service.minSales(arrMonth));
        System.out.println(service.badMonth(arrMonth));
        System.out.println(service.goodMonth(arrMonth));
    }
}
