import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static final double DELTA = 0.0001;

    @Test
    void hasEvenLength() {
        //assertEquals(true, Main.hasEvenLength("rock"));
        assertTrue(Main.hasEvenLength("rock"));
        assertFalse(Main.hasEvenLength("rocks"));
        assertTrue(!Main.hasEvenLength("dog"));

    }

    @Test
    void add() {
        assertEquals(9, Main.add(3, 6));
        assertEquals(0, Main.add(0, 0));
        assertEquals(0, Main.add(8, -8));
        assertEquals(-4, Main.add(8, -12));
        assertEquals(-4, Main.add(-12, 8));
        assertEquals(8, Main.add(9, -1));
    }

    @Test
    void log5() {
        assertEquals(2.0, Main.log5(25), DELTA);
        assertEquals(1.43067, Main.log5(10.0), DELTA);
        assertEquals(Double.NaN, Main.log5(-8.0), DELTA);
        assertEquals(Double.NEGATIVE_INFINITY, Main.log5(0), DELTA);
        assertEquals(1.0, Main.log5(5), DELTA);
    }


    @Test
    void makeProperNoun() {
        assertEquals("Abc", Main.makeProperNoun("abc"));
        assertEquals("Abc",Main.makeProperNoun("ABC"));
    }
}