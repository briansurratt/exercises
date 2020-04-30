package com.codewars.kyu7;

import java.util.ArrayList;
import java.util.List;


public class Isogram {

    public static boolean isIsogram(final String str) {

        if (str == null) {
            throw new IllegalArgumentException("str parameter may not be null.");
        }

        if ("".equals(str)) {
            return  true;
        }

        final String lowerCase = str.toLowerCase();
        final char[] chars = lowerCase.toCharArray();

        final List charactersFound = new ArrayList();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (charactersFound.contains(c)) {
                return false;
            } else  {
                charactersFound.add(c);
            }
        }

        return true;
    }

}
