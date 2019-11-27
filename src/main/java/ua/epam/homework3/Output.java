package ua.epam.homework3;

public class Output {
    public void winner(String aiChoice){
        System.out.println(Messages.WINNER.getMessage());
        System.out.println(Messages.AI_CHOICE + aiChoice);
    }

    public void loser(String aiChoice){
        System.out.println(Messages.LOSER.getMessage());
        System.out.println(Messages.AI_CHOICE + aiChoice);
    }

    public void draw(String aiChoice){
        System.out.println(Messages.DRAW.getMessage());
        System.out.println(Messages.AI_CHOICE + aiChoice);
    }

    public void makeAChoice() {
        System.out.println(Messages.MAKE_A_CHOICE.getMessage());
    }

    public void intro() {
        System.out.println(Messages.INTRO.getMessage());
    }

}
