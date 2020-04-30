package com.codewars.largest5digit;

public class LargestFiveDigitNumber {

  public static int solve(final String digits) {

    if (digits.length() == 5) {
      return Integer.parseInt(digits);
    }

    int result = 0;


    final int steps = digits.length() - 5;



    if (steps > 0) {

      for (int i = 0; i <= steps; i++) {

        final String s = digits.substring(i, 5 + i);

        final int working = Integer.parseInt(s);
        if (working > result) {
          result = working;
        }

      }

    }

    return result;

  }

}
