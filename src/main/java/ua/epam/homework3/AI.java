package ua.epam.homework3;

import java.util.Random;

public class AI {
    private final Random random = new Random();

    public String computersChoice() {
        int randomInt = random.nextInt(3) + 1;
        String compChoice = "";
        if (randomInt == 1) {
            compChoice = Choices.ROCK.getChoice();
            return compChoice;
        } else if (randomInt == 2) {
            compChoice = Choices.PAPER.getChoice();
            return compChoice;
        } else if (randomInt == 3) {
            compChoice = Choices.SCISSORS.getChoice();
            return compChoice;
        }
        return compChoice;
    }
}
