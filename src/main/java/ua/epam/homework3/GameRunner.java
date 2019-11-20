package ua.epam.homework3;

public class GameRunner {
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();
        System.out.println(MESSAGES.INTRO.getMessage());
        gameLogic.runGameLogic();
    }
}
