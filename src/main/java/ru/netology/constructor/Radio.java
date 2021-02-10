package ru.netology.constructor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {

    private String name = "default radio";
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;
    private int minChannel;
    private int maxChannel = 9;
    private int currentChannel;
    private boolean on = true;


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
