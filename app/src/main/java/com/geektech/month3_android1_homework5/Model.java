package com.geektech.month3_android1_homework5;

public class Model {
    private String musicName;
    private String musicExecutor;
    private String numbers;
    private String numbersMusic;

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicExecutor() {
        return musicExecutor;
    }

    public void setMusicExecutor(String musicExecutor) {
        this.musicExecutor = musicExecutor;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getNumbersMusic() {
        return numbersMusic;
    }

    public void setNumbersMusic(String numbersMusic) {
        this.numbersMusic = numbersMusic;
    }

    public Model(String musicName, String musicExecutor, String numbers, String numbersMusic) {
        this.musicName = musicName;
        this.musicExecutor = musicExecutor;
        this.numbers = numbers;
        this.numbersMusic = numbersMusic;
    }
}
