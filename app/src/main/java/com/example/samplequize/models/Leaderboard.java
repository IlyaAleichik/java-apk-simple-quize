package com.example.samplequize.models;

public class Leaderboard {
    private  String name;
    private  int score;


    public Leaderboard(){}
    public Leaderboard(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
