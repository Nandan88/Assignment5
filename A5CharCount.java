package com.company;
import java.util.Scanner;
public class A5CharCount {
    public static void main(String[] args){
        String s="Hello";
        Scanner sc=new Scanner(System.in);
        System.out.print("Which character you want to count: ");
        String c= sc.next();
        int count=s.length()-s.replace(c,"").length();
        System.out.println("Total number of "+c+" in string: "+count);
        System.out.println(s);
    }
}
