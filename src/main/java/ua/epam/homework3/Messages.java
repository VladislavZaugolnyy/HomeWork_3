package ua.epam.homework3;

public enum Messages {
    INTRO("Hello! You are playing Rock, Paper, Scissors against AI."),
    WINNER("Congratulations! You are the winner! Skynet has fallen."),
    LOSER("AI won. Humanity is doomed because of you. Haven't you seen Terminator?"),
    DRAW("Looks like it's a draw. Let's go again."),
    MAKE_A_CHOICE("Make a choice (Rock, Paper or Scissors)."),
    AI_CHOICE("AI picked ");
    private String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}

