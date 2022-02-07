package ru.netology.sqr;

public class SQRService {

    public int sqrtCeil(int numMin, int numMax) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= numMin) {
                if (i * i <= numMax) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
