package ua.epam.homework3;

public class Output {
    public void winner(String aiChoice){
        System.out.println(MESSAGES.WINNER.getMessage());
        System.out.println(MESSAGES.AI_CHOICE + aiChoice);
    }

    public void loser(String aiChoice){
        System.out.println(MESSAGES.LOSER.getMessage());
        System.out.println(MESSAGES.AI_CHOICE + aiChoice);
    }

    public void draw(String aiChoice){
        System.out.println(MESSAGES.DRAW.getMessage());
        System.out.println(MESSAGES.AI_CHOICE + aiChoice);
    }

    public void makeAChoice() {
        System.out.println(MESSAGES.MAKE_A_CHOICE.getMessage());
    }

    public void intro() {
        System.out.println(MESSAGES.INTRO.getMessage());
    }

}
