package com.stringPractice.allModules;

public class isPangram {

    public isPangram(String str)
    {
        char[] cSorted = str.toLowerCase().toCharArray();
        java.util.Arrays.sort(cSorted);

        char[] alpha = {'0','a','b','c','d','e','f','g','h','i','j','k','l',
                    'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
int count=0;
        for (char cs : cSorted)
        {
            if (count <= 0) {
                count = 0;

                for (int i = 1; i < alpha.length; i++) {

                    if (cs >= 'a' && cs <= 'z' && count == 0)
                    {

                        if (cs == alpha[i])
                        {
                            alpha[i] = '0';
                            count++;
                        } else if (alpha[i] == '0' && alpha[i - 1] != '0') {
                            count = 2;
                        }

                    } else break;
                }
            }
            else break;
        }

        String beta = "000000000000000000000000000";
        if (String.valueOf(alpha).equals(beta))
        {
            System.out.println("Given Sentence is Pangram");
        }
        else System.out.println("Given Sentence is Not a Pangram");


    }
}
