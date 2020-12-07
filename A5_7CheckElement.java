package com.company;
import java.util.*;
public class A5_7CheckElement {
    public static void main(String[] args){
        Vector v=new Vector();
        v.add(8);
        v.add("java");
        if(v.contains(8))
            System.out.println("Vector contains "+8);
        else {
            System.out.println("Vector does not contain required element.");
        }
    }
}