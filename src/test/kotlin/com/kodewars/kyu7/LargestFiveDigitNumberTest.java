package com.kodewars.kyu7;

import static org.junit.Assert.assertEquals;

import com.codewars.largest5digit.LargestFiveDigitNumber;
import org.junit.Test;

public class LargestFiveDigitNumberTest {

  @Test
  public void testOne() {
    assertEquals(LargestFiveDigitNumber.solve("283910"), 83910);
  }

  @Test
  public void testTwo() {
    assertEquals(LargestFiveDigitNumber.solve("1234567890"), 67890);
  }

  @Test
  public void testFiveDigitNumber() {
    assertEquals(LargestFiveDigitNumber.solve("11634"), 11634);
  }


  @Test
  public void test4DigitString() throws Exception {
    assertEquals(LargestFiveDigitNumber.solve("4890"), 0);
  }

}