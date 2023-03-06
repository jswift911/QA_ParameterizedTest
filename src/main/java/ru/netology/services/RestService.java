package ru.netology.services;

public class RestService {
    public int restMonthsCalc(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money = (money - expenses);
                money = money - (money - (money / 3));
                count++;
            } else {
                money = (money + income) - expenses;
            }
        }
        return count;
    }
}
