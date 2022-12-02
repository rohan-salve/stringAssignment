package com.stringPractice.allModules;

import java.util.Scanner;

public class userInput {
    public String takeUserInput()
    {
        System.out.println("Enter String :: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
