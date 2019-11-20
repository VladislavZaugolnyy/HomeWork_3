package ua.epam.homework3;

import org.junit.Test;
import static org.junit.Assert.*;

public class MessagesTest {
    @Test
    public void shouldReturnIntroStringByGetter() {
        assertEquals("Hello! You are playing Rock, Paper, Scissors against AI.", MESSAGES.INTRO.getMessage());
    }
    @Test
    public void shouldReturnWinnerStringByGetter() {
        assertEquals("Congratulations! You are the winner! Skynet has fallen.", MESSAGES.WINNER.getMessage());
    }
    @Test
    public void shouldReturnLoserStringByGetter() {
        assertEquals("AI won. Humanity is doomed because of you. Haven't you seen Terminator?",
                MESSAGES.LOSER.getMessage());
    }
    @Test
    public void shouldReturnDrawStringByGetter() {
        assertEquals("Looks like it's a draw. Let's go again.", MESSAGES.DRAW.getMessage());
    }
    @Test
    public void shouldReturnMakeAChoiceStringByGetter() {
        assertEquals("Make a choice (Rock, Paper or Scissors).", MESSAGES.MAKE_A_CHOICE.getMessage());
    }
    @Test
    public void shouldReturnAIChoiceStringByGetter() {
        assertEquals("AI picked ", MESSAGES.AI_CHOICE.getMessage());
    }
}
