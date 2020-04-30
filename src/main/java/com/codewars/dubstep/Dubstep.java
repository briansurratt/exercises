package com.codewars.dubstep;

public class Dubstep {

    public static final String WUB = "WUB";

    public static String SongDecoder (String song)
    {

        System.out.println(song);

        final String[] words = song.split(WUB);
        final StringBuilder stringBuilder = new StringBuilder();

        String word;
        for (int i = 0; i < words.length; i++) {
            word = words[i];
            System.out.println("[" + word + "]");
            if (word.length() == 0) {
                continue;
            }
            if (stringBuilder.length() > 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(word);
        }

        return stringBuilder.toString();

    }

    public static String SongDecoderPrime (String song)
    {

        song = song.replace(WUB, " ");
        song = song.trim();
        song = song.replaceAll(" +", " ");

        return song;

    }

    public static String SongDecoderAlpha (String song)
    {

        final StringBuilder builder =  new StringBuilder();

        while (song.length() > 0) {
            if (song.startsWith(WUB)) {
                song = song.substring(3);
            } else {
                int i = song.indexOf(WUB);
                if (i >= 0) {
                    String temp = song.substring(0, i);
                    appendWord(builder, temp);
                    song = song.substring(i);
                } else {
                    appendWord(builder, song);
                    break;
                }
            }
        }

        return builder.toString();

    }

    private static void appendWord(final StringBuilder builder, final String temp) {
        if (builder.length() > 0) {
            builder.append(" ");
        }
        builder.append(temp);
    }

}
