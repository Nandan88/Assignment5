package com.company;
import java.util.*;
import java.util.Scanner;

public class A5_10RemoveElement {
    public static void main(String[] args){
        Vector v=new Vector();
        v.add(1);v.add(2);
        v.add(3);v.add(4);v.add("a1");v.add("b1");
        System.out.println("Vector: "+v);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter index of element you want to remove: ");
        int index=sc.nextInt();
        Object o1=v.remove(index);
        System.out.println(o1+" is removed successfully.");
        System.out.println("Vector: "+v);
    }
}
