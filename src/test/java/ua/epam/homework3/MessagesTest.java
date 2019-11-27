package ua.epam.homework3;

import org.junit.Test;
import static org.junit.Assert.*;

public class MessagesTest {
    @Test
    public void shouldReturnIntroStringByGetter() {
        assertEquals("Hello! You are playing Rock, Paper, Scissors against AI.", Messages.INTRO.getMessage());
    }
    @Test
    public void shouldReturnWinnerStringByGetter() {
        assertEquals("Congratulations! You are the winner! Skynet has fallen.", Messages.WINNER.getMessage());
    }
    @Test
    public void shouldReturnLoserStringByGetter() {
        assertEquals("AI won. Humanity is doomed because of you. Haven't you seen Terminator?",
                Messages.LOSER.getMessage());
    }
    @Test
    public void shouldReturnDrawStringByGetter() {
        assertEquals("Looks like it's a draw. Let's go again.", Messages.DRAW.getMessage());
    }
    @Test
    public void shouldReturnMakeAChoiceStringByGetter() {
        assertEquals("Make a choice (Rock, Paper or Scissors).", Messages.MAKE_A_CHOICE.getMessage());
    }
    @Test
    public void shouldReturnAIChoiceStringByGetter() {
        assertEquals("AI picked ", Messages.AI_CHOICE.getMessage());
    }
}
