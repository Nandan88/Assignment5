package com.company;

public class A5Reverse {
    public static void main(String[] args){
        String str="ab cd ef gh";
        String str1="",str2="";
        int l=str.length();
        for(int i=(l-1);i>=0;i--){
            if(str.charAt(i)==' '){
                str2=str1+" "+str2;
                str1="";
            }
            else {
                str1 = str1 + str.charAt(i);
            }
        }
        str2=str1+" "+str2;
        str=str2;
        System.out.println(str);
    }
}