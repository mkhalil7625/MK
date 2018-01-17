package com.MK;

public class StringsPractice {
    //use psvm
    public static void main(String[]args){
        String name = "Mohammed";
        //sout shortut to next
        System.out.println("Hello "+name);
        String nameInUpperCase = name.toUpperCase();
        System.out.println(nameInUpperCase);
        String nameInLowercase = name.toLowerCase();
        System.out.println(nameInLowercase);
        int lettersInName = name.length();
        System.out.println(lettersInName);
    }
}
