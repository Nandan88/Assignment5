package com.company;
import java.util.Scanner;

public class A5Substring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="Assignment";
        System.out.println("String: "+str+"\nEnter the start index and end index: ");
        int i=sc.nextInt();
        int j=sc.nextInt();
        System.out.println("Substring: "+str.substring(i,j+1));
    }
}
