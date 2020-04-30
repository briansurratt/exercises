package com.codewars.kyu8;

import com.codewars.grasshopper.Move;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MoveTest {
    @Test
    public void test1() {
        assertEquals(8, Move.move(0, 4));
    }
    @Test
    public void test2() {
        assertEquals(15, Move.move(3, 6));
    }
    @Test
    public void test3() {
        assertEquals(12, Move.move(2, 5));
    }
}
