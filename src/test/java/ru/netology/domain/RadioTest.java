package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldInitialize() {
        Radio radio = new Radio();

        radio.initialization();
        assertEquals("default radio", radio.getName());
        assertEquals(0, radio.getMinVolume());
        assertEquals(10, radio.getMaxVolume());
        assertEquals(0, radio.getMinChannel());
        assertEquals(9, radio.getMaxChannel());
    }


    @Test
    public void shouldIncreaseVolume() {

        Radio radio = new Radio();

        radio.initialization();
        assertEquals(0, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(1, radio.getCurrentVolume());
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());


    }

    @Test
    public void shouldReduceVolume() {

        Radio radio = new Radio();

        radio.initialization();
        assertEquals(0, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(1, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldGoToNextChannel() {

        Radio radio = new Radio();

        radio.initialization();
        assertEquals(0, radio.getCurrentChannel());
        radio.nextChannel();
        assertEquals(1, radio.getCurrentChannel());
        radio.setCurrentChannel(9);
        assertEquals(9, radio.getCurrentChannel());
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldGoToPreviousChannel() {

        Radio radio = new Radio();

        radio.initialization();
        assertEquals(0, radio.getCurrentChannel());
        radio.nextChannel();
        assertEquals(1, radio.getCurrentChannel());
        radio.previousChannel();
        assertEquals(0, radio.getCurrentChannel());
        radio.previousChannel();
        assertEquals(9, radio.getCurrentChannel());
    }


    @Test
    public void shouldChangeChannel() {

        Radio radio = new Radio();

        radio.initialization();
        radio.setCurrentChannel(5);
        assertEquals(5, radio.getCurrentChannel());
        radio.setCurrentChannel(-1);
        assertEquals(5, radio.getCurrentChannel());
        radio.setCurrentChannel(10);
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    public void shouldChangeName() {

        Radio radio = new Radio();

        radio.initialization();
        assertEquals("default radio", radio.getName());
        radio.setName("name radio");
        assertEquals("name radio", radio.getName());
        radio.setName("very very long name for radio home");
        assertEquals("name radio", radio.getName());
        radio.setName("a");
        assertEquals("name radio", radio.getName());
        radio.setName("");
        assertEquals("name radio", radio.getName());
    }


}