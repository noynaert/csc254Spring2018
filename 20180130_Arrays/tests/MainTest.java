import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    final static double DELTA = 0.01;
    final static String ALLOWED = "?!,.";
    @Test
    void main() {
    }

    @Test
    void getEntropy() {
        assertEquals(52,Main.getEntropy("fishdogcow1",ALLOWED));

    }

    @Test
    void calculateEntropy() {
        assertEquals(52,Main.calculateEntropy(36,11));
    }


    @Test
    void log2() {
        assertEquals(6, Main.log2(64),DELTA);
        assertEquals(4.6438, Main.log2(25. ),DELTA);
        assertEquals(1.31293, Main.log2(2.5 ),DELTA);
        assertEquals(Double.NEGATIVE_INFINITY, Main.log2(0),DELTA);
        assertEquals(Double.NaN, Main.log2(-1),DELTA);
        assertEquals(9.96651 , Main.log2(1000.5) ,DELTA);
    }

}