package com.company;
import java.util.*;
public class A5_12Sort {
    public static void main(String[] args){
        Vector v=new Vector();
        v.add(100);v.add(21);v.add(43);v.add(14);
        v.add(9);v.add(8);
        Collections.sort(v);
        System.out.println("Sorted Vector: "+v);
    }
}
