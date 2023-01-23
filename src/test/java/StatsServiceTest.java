import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void totalOfAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int allSales = 180;
        int sale = service.totalOfAllSales(sales);

        Assertions.assertEquals(allSales, sale);

    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int arithmeticMean = 15;
        int sale = service.averageSales(sales);

        Assertions.assertEquals(arithmeticMean, sale);

    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int maxSales = 8;
        int sale = service.maxSales(sales);

        Assertions.assertEquals(maxSales, sale);

    }


    @Test
    public void minSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int minSales = 9;
        int sale = service.minSales(sales);

        Assertions.assertEquals(minSales, sale);

    }

    @Test
    public void monthsAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int numberOfMonths = 5;
        int sale = service.monthsAboveAverage(sales);

        Assertions.assertEquals(numberOfMonths, sale);

    }

    @Test
    public void monthsLessAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int numberOfMonths = 5;
        int sale = service.monthsLessAverage(sales);

        Assertions.assertEquals(numberOfMonths, sale);

    }
}


