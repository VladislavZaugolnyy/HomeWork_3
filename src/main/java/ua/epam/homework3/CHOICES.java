package ua.epam.homework3;

public enum CHOICES {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String choice;

    CHOICES(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }
}

