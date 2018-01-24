import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void hasDigits() {
        assertTrue(Main.hasDigits("abc123"));
        assertTrue(Main.hasDigits("0"));
        assertTrue(Main.hasDigits("9"));
        assertTrue(Main.hasDigits("123456"));
        assertTrue(Main.hasDigits("123Abc"));
        assertFalse(Main.hasDigits(""));
        assertFalse(Main.hasDigits("/"));
        assertFalse(Main.hasDigits(":"));
        assertFalse(Main.hasDigits("abc"));
        assertFalse(Main.hasDigits("God, black treasure!"));
        assertFalse(Main.hasDigits("Rich, smooth pudding is best enamelled with aromatic soy sauce."));

        for(char ch = '0';ch<='9';ch++)
            assertTrue(Main.hasDigits(""+ch));
    }

}