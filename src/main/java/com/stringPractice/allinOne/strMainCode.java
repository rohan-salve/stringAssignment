package com.stringPractice.allinOne;

import com.stringPractice.allModules.*;



public class strMainCode {
    public static void main(String[] args)
    {
        userInput ip = new userInput();
        System.out.println("Check String Reverse --");
        new strRev(ip.takeUserInput());
        System.out.println("Check Sentence Reverse --");
        new strSplitRev(ip.takeUserInput());
        isAnagram check = new isAnagram();
        System.out.println("\nLets Check Anagrams --");
        System.out.println("Strings are Anagrams - "+check.checkAnagram(ip.takeUserInput(), ip.takeUserInput()));
        System.out.println("Lets Check Panagrams --");
        new isPangram(ip.takeUserInput());
        System.out.println("Lets Check Repetitively Occurring Character in String -- ");
        new duplicateChar(ip.takeUserInput());
        System.out.println("Lets Sort String--");
        new sortString(ip.takeUserInput());
        System.out.println("Lets Check Vowels and Consonants from String --");
        new checkVC(ip.takeUserInput());
        System.out.println("Lets check Count of Special Character from String --");
        new specialCharCount(ip.takeUserInput());


    }
}
