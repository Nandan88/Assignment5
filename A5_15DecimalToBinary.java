package com.company;
import java.util.*;
public class A5_15DecimalToBinary {
    public static int binary(int num){
        if(num==0)
            return 0;
        else
            return num%2+10*binary(num/2);
    }

    public static void main(String[] args){
        System.out.print("Enter any decimal number to convert it to binary: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(binary(num));;
    }
}
