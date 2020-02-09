import org.junit.Test;

import static org.junit.Assert.*;

public class WordCheckingTest {

    @Test
    public void getWord() {
        WordChecking check = new WordChecking("Testing");
        assertEquals("Testing", check.getWord());

    }
}