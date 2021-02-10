package ru.netology.constructor;

public class Radio {

    private String name = "default radio";
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;
    private int minChannel;
    private int maxChannel = 9;
    private int currentChannel;
    private boolean on = true;


    public Radio(String name,
                 int minVolume,
                 int maxVolume,
                 int currentVolume,
                 int minChannel,
                 int maxChannel,
                 int currentChannel,
                 boolean on) {

        this.name = name;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
        this.minChannel = minChannel;
        this.maxChannel = maxChannel;
        this.currentChannel = currentChannel;
        this.on = on;
    }

    public Radio() {
    }

    public Radio(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public Radio(int maxChannel, int currentChannel) {
        this.maxChannel = maxChannel;
        this.currentChannel = currentChannel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
        this.currentChannel = currentChannel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public int goToChannel(int channel) {
        if (channel > maxChannel) {
            currentChannel = maxChannel;
        } else {

            currentChannel = channel;
        }
        return currentChannel;

    }

    public String renameUnit(String newName) {

        if (newName.length() > 30) {
            System.out.println("Ваше имя слишком длинное");

        } else if (newName.equals("")) {
            System.out.println("Имя не может быть пустым");

        } else if (newName.length() < 4) {
            System.out.println("Имя должно быть больше 4 символов");

        } else {
            name = newName;
        }
        return name;
    }

}
