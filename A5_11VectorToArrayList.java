package com.company;
import java.util.*;

public class A5_11VectorToArrayList {
    public static void main(String[] args){
        Vector v=new Vector();
        v.add(1);v.add(2);
        v.add(3);v.add(4);v.add("Vector");v.add("String");
        ArrayList al=new ArrayList();         // Method 1
        for(int i=0;i<v.size();i++){
            al.add(v.get(i));
        }
//        ArrayList al=new ArrayList(v);      // Method 2
        System.out.println("Vector: "+v+"\nArrayList: "+al);
    }
}