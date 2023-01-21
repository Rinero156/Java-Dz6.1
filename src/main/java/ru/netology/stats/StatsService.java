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
        int arithmeticMean = 0;
        for (int sale : sales) {
            arithmeticMean += sale;
        }
        return arithmeticMean / sales.length;
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
        int allSales = 0;
        int numberOfMonths = 0;
        int arithmeticMean;
        for (int sale : sales) {
            allSales += sale;
        }
        arithmeticMean = allSales / sales.length;
        for (int sale : sales) {
            if (sale < arithmeticMean) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public int monthsLessAverage(int[] sales) {
        int allSales = 0;
        int numberOfMonths = 0;
        int arithmeticMean;
        for (int sale : sales) {
            allSales += sale;
        }
        arithmeticMean = allSales / sales.length;
        for (int sale : sales) {
            if (sale > arithmeticMean) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}
