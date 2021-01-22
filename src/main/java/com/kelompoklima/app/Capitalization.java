package com.kelompoklima.app;

import org.apache.commons.lang3.StringUtils;

public class Capitalization {

    public static void main(String[] args) {
        
    }

    public static String[] firstOutputWithoutLibrary(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();
    
        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                .append(arr[i].substring(1)).append(" ");
        }          
        String hasilAwal = sb.toString().trim();
        String[] words = hasilAwal.split("\\W+");
        return words;
    }

    public static String[] firstOutputWithLibrary(String givenString) {
        String hasilAwal;
        for(String word : givenString){
            hasilAwal = StringUtils.capitalize(word);
        }

        String[] words = hasilAwal.split("\\W+");
        return words;
    }
    
}