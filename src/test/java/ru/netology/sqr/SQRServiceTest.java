package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void sqrtCeil() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.sqrtCeil(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void sqrtCeilAnotherRange() {
        SQRService service = new SQRService();
        int expected = 11;
        int actual = service.sqrtCeil(100, 400);
        assertEquals(expected, actual);
    }

    @Test
    void sqrtCeilMaxNumber() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.sqrtCeil(9700, 9900);
        assertEquals(expected, actual);
    }

    @Test
    void sqrtCeilUnderMaxNumber() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.sqrtCeil(9900, 10000);
        assertEquals(expected, actual);
    }

    @Test
    void sqrtCeilMinNumber() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.sqrtCeil(80, 110);
        assertEquals(expected, actual);
    }

    @Test
    void sqrtCeilUnderMinNumber() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.sqrtCeil(40, 99);
        assertEquals(expected, actual);
    }
}