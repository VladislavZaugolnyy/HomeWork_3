package ua.epam.homework3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChoicesTest {
    @Test
    public void shouldReturnRockStringByGetter() {
        assertEquals("Rock", CHOICES.ROCK.getChoice());
    }

    @Test
    public void shouldReturnPaperStringByGetter() {
        assertEquals("Paper", CHOICES.PAPER.getChoice());
    }

    @Test
    public void shouldReturnScissorsStringByGetter() {
        assertEquals("Scissors", CHOICES.SCISSORS.getChoice());
    }
}
