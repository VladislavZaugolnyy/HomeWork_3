package ua.epam.homework3;

public enum Choices {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String choice;

    Choices(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }
}

