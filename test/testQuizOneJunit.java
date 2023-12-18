import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testQuizOneJunit {

    private QuizOneJunit quiz;

    @Before
    public void setUp() {
        quiz = new QuizOneJunit();
    }

    @Test
    public void testSquare() {
        assertEquals(25, quiz.square(5));
        assertEquals(0, quiz.square(0));
        assertEquals(100, quiz.square(-10)); // Example with a negative number
    }

    @Test
    public void testCountLetterA() {
        assertEquals(2, quiz.countLetterA("APPle"));
        assertEquals(0, quiz.countLetterA("BANANA"));
        assertEquals(3, quiz.countLetterA("AARDVARK"));
        assertEquals(0, quiz.countLetterA("")); // Example with an empty string
    }

    @Test
    public void testCheckTwoLetter() {
        assertTrue(quiz.checkTwoLetter("AA"));
        assertTrue(quiz.checkTwoLetter("ABAB"));
        assertFalse(quiz.checkTwoLetter("A"));
        assertFalse(quiz.checkTwoLetter(""));
        assertFalse(quiz.checkTwoLetter("ABCD"));
    }
}