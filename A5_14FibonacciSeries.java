package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class A5_14FibonacciSeries {
    static int n1=0,n2=1,n3=0;
    public static void fibonacci(int num){
        if(num>0){

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            fibonacci(num-1);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n to print n terms of fibonacci series: ");
        int n=sc.nextInt();
        if (n == 1)
            System.out.print(n1);
        else
            System.out.print(n1+" "+n2);

        fibonacci(n-2);

    }
}