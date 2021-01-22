package com.kelompoklima.app;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Capitalization {
    
    public static String[] firstOutputWithoutLibrary(String[] givenString) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < givenString.length; i++) {
            sb.append(Character.toUpperCase(givenString[i].charAt(0)))
                .append(givenString[i].substring(1)).append(" ");
        }          
        String hasilAwal = sb.toString().trim();
        String[] words = hasilAwal.split("\\W+");
        return words;
    }

    public static String[] firstOutputWithLibrary(String[] givenString) {
        for (int i = 0; i < givenString.length; i++) {
            givenString[i] = StringUtils.capitalize(givenString[i]);
        }

        return givenString;
    }

    public static void main(String[] args) {
        String[] words = args[0].split(" ");

        System.out.println("Without Library:");
        System.out.println(Arrays.toString(firstOutputWithoutLibrary(words)));
        for (String word: words) {
            char first = word.charAt(0);
            if (Character.isLowerCase(first)) {
                first = Character.toUpperCase(first);
            }
            System.out.printf("%c%s ", first, word.substring(1));
        }

        System.out.println("\nWith Library:");
        System.out.println(Arrays.toString(firstOutputWithLibrary(words)));
        for (String word: words) {
            System.out.printf("%s ", StringUtils.capitalize(word));
        }
    }
}