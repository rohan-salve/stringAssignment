package com.stringPractice.allModules;

import java.util.Arrays;

public class duplicateChar {
    public duplicateChar(String str)
    {

        char[] cSorted = str.toLowerCase().toCharArray();
        Arrays.sort(cSorted);
        int count =0;
        for(int i = 0; i <cSorted.length; i++) {
            count = 1;
            for(int j = i+1; j <cSorted.length; j++) {
                if(cSorted[i] == cSorted[j] && cSorted[i] != ' ') {
                    count++;

                    cSorted[j] = '0';
                }
            }

            if(count > 1 && cSorted[i] != '0')
                System.out.println(cSorted[i]);
        }
    }


}

