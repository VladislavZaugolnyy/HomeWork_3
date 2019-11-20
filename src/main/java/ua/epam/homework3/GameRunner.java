package ua.epam.homework3;

public class GameRunner {
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();
        Output output = new Output();
        output.intro();
        gameLogic.runGameLogic();
    }
}
