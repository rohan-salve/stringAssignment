package com.stringPractice.allModules;

public class specialCharCount {
    public specialCharCount(String str)
    {
        char[] cArray = str.toLowerCase().toCharArray();
        int count =0 ;
        for (char c : cArray )
        {
            if ( c != ' ' && (c<'a' || c>'z') && (c<'0' || c >'9') )
            {
                count++;
            }
        }
        System.out.println("Number of Special Characters in String - "+count);

    }
}
