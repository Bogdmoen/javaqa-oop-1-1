package ru.netology.domain;

public class Radio {

    private String name;
    private int minVolume;
    private int maxVolume;
    private int currentVolume;
    private int minChannel;
    private int maxChannel;
    private int currentChannel;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 30) {
            System.out.println("Ваше имя слишком длинное");
            return;
        }
        if (name.equals("")) {
            System.out.println("Имя не может быть пустым");
            return;
        }
        if (name.length() < 4) {
            System.out.println("Имя должно быть больше 4 символов");
            return;
        }
        this.name = name;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        if (currentChannel < minChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    public boolean initialization() {   // метод присваивает тестовые значения параметрам устройства

        setOn(true);
        setName("default radio");
        setMaxVolume(10);
        setMaxChannel(9);

        return on;
    }


    public int plusVolume() {
        currentVolume++;
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int minusVolume() {
        currentVolume--;
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        return minVolume;
    }

    public int nextChannel() {
        currentChannel++;
        if (currentChannel > maxChannel) {
            currentChannel = minChannel;
        }
        return currentChannel;
    }

    public int previousChannel() {
        currentChannel--;
        if (currentChannel < minChannel) {
            currentChannel = maxChannel;

        }
        return currentChannel;
    }

}
