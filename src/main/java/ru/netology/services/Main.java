package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        int restCalc1 = service.restMonthsCalc(10_000, 3000, 20_000);
        int restCalc2 = service.restMonthsCalc(100_000, 60_000, 150_000);
        System.out.println(restCalc1);
        System.out.println(restCalc2);
    }
}