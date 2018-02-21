package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void readWords() {
        int n;
        String[] words = new String[10];
        String[] bright = {"There", "was", "a", "young", "lady", "from", "Bright,", "whose",
                      "speed", "was"};
        assertEquals(10, Main.readWords("bright.txt",words, 10));

        Main.readWords("bright.txt",words, 10);
        assertArrayEquals(bright, words);


        //cleaner
        words = new String[10];
        String[] shorttxt = {"How","now", "brown", "cow", null, null, null, null, null, null};
        n = Main.readWords("short.txt", words, 10);
        assertEquals(4, n);
        assertArrayEquals(shorttxt, words);

        //test empty
        words = new String[10];
        String[] empty = new String[10];
        n = Main.readWords("empty.txt", words, 10);
        assertEquals(0, n);
        assertArrayEquals(empty, words);
    }

    @Test
    void selectionSort(){
        String[] a = {"How", "Now", "Brown", "Cow"};
        String[] as= {"Brown", "Cow", "How", "Now"};
        String[] b = {};
        String[] bs= {};
        String[] c = {"Bob"};
        String[] cs= {"Bob"};
        String[] d = {"Abe", "Bob","Cher", "Doug", "Ed"};
        String[] ds= {"Abe", "Bob","Cher", "Doug", "Ed"};
        String[] e = {"Abe", "bob","Cher", "doug", "Ed"};
        String[] es= {"abe", "bob","Cher", "doug", "Ed"};
        String[] f = {"abc", "123", "efg", "000",null,null,null};
        String[] fs = {"000", "123", "abc", "efg",null,null,null};

        Main.selectionSort(a,a.length);
        assertArrayEquals(as, a);

        Main.selectionSort(b, b.length);
        assertArrayEquals(bs, b);




    }

    @Test
    void findLongest() {
        String[] words = new String[10];
        int n = Main.readWords("bright.txt", words, 10);
        assertEquals("Bright,".length(), Main.findLongest(words, 10));

        String[] a = {"Bob", "Ted", "Alice", "Caroline"};
        String[] b = {};
        String[] c = {"Bob"};
        String[] d = {"Alice", "Bob", "Caroline", "Ted"};
        String[] e = {"Alice", "Bob", "Caroline", "Ted", null, null, null};
        String[] f = {null, null, null, null};
        String[] g = new String[4];

        assertArrayEquals(f, g);  //not really a test for findLongest

        assertEquals("Caroline".length(), Main.findLongest(a,a.length));
        assertEquals(0, Main.findLongest(b,b.length));
        assertEquals("Bob".length(), Main.findLongest(c,c.length));
        assertEquals("Caroline".length(), Main.findLongest(d,d.length));
        assertEquals("Caroline".length(), Main.findLongest(d,4));
        assertEquals(0, Main.findLongest(f,0));
        assertEquals(0, Main.findLongest(g,0));
    }
}