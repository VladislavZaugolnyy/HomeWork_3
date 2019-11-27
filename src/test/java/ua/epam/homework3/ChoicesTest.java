package ua.epam.homework3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChoicesTest {
    @Test
    public void shouldReturnRockStringByGetter() {
        assertEquals("Rock", Choices.ROCK.getChoice());
    }

    @Test
    public void shouldReturnPaperStringByGetter() {
        assertEquals("Paper", Choices.PAPER.getChoice());
    }

    @Test
    public void shouldReturnScissorsStringByGetter() {
        assertEquals("Scissors", Choices.SCISSORS.getChoice());
    }
}
