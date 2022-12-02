package com.stringPractice.allModules;

public class sortString {
    public sortString(String str)
    {


        char[] word=str.toCharArray();

        for(int i=0;i<(word.length-1);i++){
            for(int j=i+1;j>0;j--){
                if(word[j]<word[j-1]){
                    char temp=word[j-1];
                    word[j-1]=word[j];
                    word[j]=temp;
                }
            }
        }
        str=String.valueOf(word);
        System.out.println(str);
    }
    }

