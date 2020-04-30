package com.codewars.kyu6;

import com.codewars.dubstep.Dubstep;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SongTests {
    @Test
    public void Test1() {
        assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void Test2() {
        assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
    }

    @Test
    public void test3() throws Exception {
        assertEquals("I AM X", new Dubstep().SongDecoder("WUBWUBIWUBAMWUBWUBX"));
    }

    @Test
    public void test4() throws Exception {
        assertEquals("Q", new Dubstep().SongDecoder("Q"));
    }

    @Test
    public void test5() throws Exception {
        assertEquals("Q", new Dubstep().SongDecoder("WUBQ"));
    }
    @Test
    public void test6() throws Exception {
        assertEquals("Q", new Dubstep().SongDecoder("WUBQWUB"));
    }
    @Test
    public void test7() throws Exception {
        assertEquals("Q", new Dubstep().SongDecoder("QWUB"));
    }

    @Test
    public void test8() throws Exception {
        assertEquals("WE ARE THE CHAMPIONS MY FRIEND", new Dubstep().SongDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }

}


