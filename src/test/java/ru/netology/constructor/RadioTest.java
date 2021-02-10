package ru.netology.constructor;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RadioTest {


    @Test
    public void shouldInitialize() {
        Radio radio = new Radio();

        assertEquals("default radio", radio.getName());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinChannel());
        assertEquals(9, radio.getMaxChannel());
        assertTrue(radio.isOn());
    }

    @Test
    public void shouldInitializeConstructor() {
        Radio radio = new Radio("New Radio", 0, 100, 10, 0, 20, 1, true);

        assertEquals("New Radio", radio.getName());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(10, radio.getCurrentVolume());
        assertEquals(0, radio.getMinChannel());
        assertEquals(20, radio.getMaxChannel());
        assertEquals(1, radio.getCurrentChannel());
        assertTrue(radio.isOn());
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio(95);

        assertEquals(95, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(96, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(97, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio(98);

        assertEquals(98, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(99, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());

    }


    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio(5);
        assertEquals(5, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(4, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotReduceVolume() {
        Radio radio = new Radio(1);

        assertEquals(1, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void shouldGoToNextChannel() {
        Radio radio = new Radio();

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
        Radio radio = new Radio(15, 0);

        radio.goToChannel(5);
        assertEquals(5, radio.getCurrentChannel());
        radio.goToChannel(15);
        assertEquals(15, radio.getCurrentChannel());
        radio.goToChannel(16);
        assertEquals(15, radio.getCurrentChannel());
        radio.goToChannel(0);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldChangeName() {
        Radio radio = new Radio();

        assertEquals("default radio", radio.getName());
        radio.renameUnit("name radio");
        assertEquals("name radio", radio.getName());
    }

    @Test
    public void shouldNotChangeName() {
        Radio radio = new Radio();

        assertEquals("default radio", radio.getName());
        radio.renameUnit("very very long name for radio home");
        assertEquals("default radio", radio.getName());
        radio.renameUnit("a");
        assertEquals("default radio", radio.getName());
        radio.renameUnit("");
        assertEquals("default radio", radio.getName());
    }


}