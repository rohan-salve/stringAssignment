package com.stringPractice.allModules;

public class strSplitRev {
    public strSplitRev(String str)
    {

        String[] s1 = str.split(" ");
        for (String s: s1) {
            char [] ch = s.toCharArray();
            for (int counter =  ch.length - 1; counter >=0; counter--)
            {
                System.out.print(ch[counter]);
            }
            System.out.print(" ");
        }

    }
}
