package ru.netology.javaqa;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int amountStations = 10;

    public Radio() {
    }

    public Radio (int amountStations) {
        this.amountStations = amountStations;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {
        if (currentStation == amountStations - 1) {
            currentStation = 0;
            return;
        }
        currentStation = currentStation + 1;
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = amountStations - 1;
            return;
        }
        currentStation = currentStation - 1;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > (amountStations - 1)) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
