package ua.epam.homework3;

import java.util.Scanner;

public class GameLogic {
    private final Scanner scanner = new Scanner(System.in);
    private AI ai = new AI();
    private Output output = new Output();

    public void runGameLogic() {
        output.makeAChoice();
        String playersChoice = scanner.nextLine();
        String aiChoice = ai.computersChoice();

        if (playersChoice.equalsIgnoreCase("rock")) {
            if (aiChoice.equals(CHOICES.PAPER.getChoice())) {
                output.loser(aiChoice);
            } else if (aiChoice.equals(CHOICES.SCISSORS.getChoice())) {
                output.winner(aiChoice);
            } else if (playersChoice.equalsIgnoreCase(aiChoice)) {
                output.draw(aiChoice);
                runGameLogic();
            }
        } else if (playersChoice.equalsIgnoreCase("paper")) {
            if (aiChoice.equals(CHOICES.ROCK.getChoice())) {
                output.winner(aiChoice);
            } else if (aiChoice.equals(CHOICES.SCISSORS.getChoice())) {
                output.loser(aiChoice);
            } else {
                output.draw(aiChoice);
                runGameLogic();
            }
        } else if (playersChoice.equalsIgnoreCase("scissors")) {
            if (aiChoice.equals(CHOICES.ROCK.getChoice())) {
                output.loser(aiChoice);
            } else if (aiChoice.equals(CHOICES.PAPER.getChoice())) {
                output.winner(aiChoice);
            } else {
                output.draw(aiChoice);
                runGameLogic();
            }
        } else if (playersChoice.length() == 0) {
            runGameLogic();
        } else {
            runGameLogic();
        }
    }
}





