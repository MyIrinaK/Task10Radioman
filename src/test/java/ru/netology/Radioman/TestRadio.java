package ru.netology.Radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {


    @Test
    public void shouldSetDefaultRadioStationNumber() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();

        int expected = 10;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio(5);

        int expected = 5;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMoreThanDefaultRadioStationNumber() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio(15);

        int expected = 14;
        int actual = radio.maxRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationNumberZero() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberOne() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberEight() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberNine() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberTen() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNextFromMiddle() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();
        radio.setCurrentRadioStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNextFromEnd() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationPrevFromMiddle() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();
        radio.setCurrentRadioStation(5);

        radio.prev();

        int expected = 4;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationPrevFromStart() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeFromMiddle() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();
        radio.currentVolume = 5;

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeFromEnd() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();
        radio.currentVolume = 100;

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeFromMiddle() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();
        radio.currentVolume = 5;

        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeFromStart() {
        ru.netology.Radioman.Radio radio = new ru.netology.Radioman.Radio();
        radio.currentVolume = 0;

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
