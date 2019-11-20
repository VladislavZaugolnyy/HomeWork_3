package ua.epam.homework3;

import java.util.Scanner;

public class GameLogic {
    private final Scanner scanner = new Scanner(System.in);
    private AI ai = new AI();

    public void runGameLogic() {
        System.out.println(MESSAGES.MAKE_A_CHOICE.getMessage());
        String playersChoice = scanner.nextLine();
        String aiChoice = ai.computersChoice();

        if (playersChoice.equalsIgnoreCase("rock")) {
            if (aiChoice.equals(CHOICES.PAPER.getChoice())) {
                System.out.println(MESSAGES.LOSER.getMessage());
                System.out.println(MESSAGES.AI_CHOICE + aiChoice);
            } else if (aiChoice.equals(CHOICES.SCISSORS.getChoice())) {
                System.out.println(MESSAGES.WINNER.getMessage());
                System.out.println(MESSAGES.AI_CHOICE + aiChoice);
            } else if (playersChoice.equalsIgnoreCase(aiChoice)) {
                System.out.println(MESSAGES.DRAW.getMessage());
                System.out.println(MESSAGES.AI_CHOICE + aiChoice);
                runGameLogic();
            }
        } else if (playersChoice.equalsIgnoreCase("paper")) {
            if (aiChoice.equals(CHOICES.ROCK.getChoice())) {
                System.out.println(MESSAGES.WINNER.getMessage());
                System.out.println(MESSAGES.AI_CHOICE + aiChoice);
            } else if (aiChoice.equals(CHOICES.SCISSORS.getChoice())) {
                System.out.println(MESSAGES.LOSER.getMessage());
                System.out.println(MESSAGES.AI_CHOICE + aiChoice);
            } else {
                System.out.println(MESSAGES.DRAW.getMessage());
                System.out.println(MESSAGES.AI_CHOICE + aiChoice);
                runGameLogic();
            }
        } else if (playersChoice.equalsIgnoreCase("scissors")) {
            if (aiChoice.equals(CHOICES.ROCK.getChoice())) {
                System.out.println(MESSAGES.LOSER.getMessage());
                System.out.println(MESSAGES.AI_CHOICE + aiChoice);
            } else if (aiChoice.equals(CHOICES.PAPER.getChoice())) {
                System.out.println(MESSAGES.WINNER.getMessage());
                System.out.println(MESSAGES.AI_CHOICE + aiChoice);
            } else {
                System.out.println(MESSAGES.DRAW.getMessage());
                System.out.println(MESSAGES.AI_CHOICE + aiChoice);
                runGameLogic();
            }
        } else if (playersChoice.length() == 0) {
            runGameLogic();
        } else {
            runGameLogic();
        }
    }
}





