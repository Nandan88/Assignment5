package com.company;
import java.util.*;

public class A5_13Replace {
    public static void main(String[] args){
        Vector v=new Vector();
        v.add(1);v.add(4);v.add(3);v.add(2);
        System.out.println("Vector: "+v);
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any object to replace: ");
        int o=s.nextInt();
        int i=v.indexOf(o);
        System.out.print("Enter the new object(number): ");
        int o1=s.nextInt();
        v.setElementAt(o1,i);
        System.out.println("Updated Vector: "+v);
    }
}