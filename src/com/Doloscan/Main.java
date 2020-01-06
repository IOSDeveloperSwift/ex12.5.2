package com.Doloscan;

public class Main {

    public static void main(String[] args) {

        String str1 = "It is a String";
        System.out.println("The given String is: " + str1);
        System.out.println("The new String is: " + wordRep(str1));

    }

    public static String wordRep(String str) {
        String newStr = " ";
        int len = str.length();

        for (int i = 0; i < len; i++) {

            if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1)) || i + 2 < len && Character.isLetter(str.charAt(i + 2))) {
                newStr += str.charAt(i);
            } else if (i + 1 < len && str.substring(i, i + 2).equals("is")) {
                newStr += "is not";
                i++;
            } else {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
}
