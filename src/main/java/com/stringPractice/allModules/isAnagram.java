package com.stringPractice.allModules;

import static java.util.Arrays.sort;

public class isAnagram {

    public boolean checkAnagram(String s1 , String s2)
    {
        if (s1.length() == s2.length())
        {
            if (s1.equalsIgnoreCase(s2))
            {
                return true;
            }

            else
            {
                char[] s3 = s1.toCharArray();
                char[] s4 = s2.toCharArray();
                sort(s3);
                sort(s4);
                if (String.valueOf(s3).equalsIgnoreCase(String.valueOf(s4)))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }

        }
        else
        {
            return false;
        }

    }

}
