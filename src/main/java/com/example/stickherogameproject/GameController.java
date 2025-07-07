package com.example.stickherogameproject;

public class GameController {
    private static GameController instance;
    private int score;
    private int cherries;
    private int gameState;

    private GameController() {
        score = 0;
        cherries = 0;
        gameState = 0;
    }
    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCherries() {
        return cherries;
    }

    public void setCherries(int cherries) {
        this.cherries = cherries;
    }

    public int getGameState() {
        return gameState;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }

}
