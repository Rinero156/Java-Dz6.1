package ru.netology.stats;

public class StatsService {
    public int totalOfAllSales(int[] sales) {
        int allSales = 0;
        for (int sale : sales) {
            allSales += sale;
        }
        return allSales;
    }

    public int averageSales(int[] sales) {
        int arithmeticMean = totalOfAllSales(sales) / sales.length;
        return arithmeticMean;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsAboveAverage(int[] sales) {
        int numberOfMonths = 0;
        for (int sale : sales) {
            if (sale < averageSales(sales)) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public int monthsLessAverage(int[] sales) {
        int numberOfMonths = 0;
        for (int sale : sales) {
            if (sale > averageSales(sales)) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}
