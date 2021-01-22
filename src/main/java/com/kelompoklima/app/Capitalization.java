package com.kelompoklima.app;

import org.apache.commons.lang3.StringUtils;

public class Capitalization {

    public static void main(String[] args) {
        String[] words = args[0].split(" ");

        System.out.println("Without Library:");
        for (String word: words) {
            char first = word.charAt(0);
            if (Character.isLowerCase(first)) {
                first = Character.toUpperCase(first);
            }
            System.out.printf("%c%s ", first, word.substring(1));
        }

        System.out.println("\nWith Library:");
        for (String word: words) {
            System.out.printf("%s ", StringUtils.capitalize(word));
        }
    }
}
