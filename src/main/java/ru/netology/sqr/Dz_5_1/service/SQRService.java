package ru.netology.sqr.Dz_5_1.service;

public class SQRService {
    public int numberOfSqr(int lowerBound, int upperBound) {
        int number = 0;
        for (int i = 10; i < 100; i++) {
            if (lowerBound - 1 < i * i) {
                if (i * i < upperBound + 1) {
                    number = number + 1;
                }
            }
        }
        return number;
    }
}
