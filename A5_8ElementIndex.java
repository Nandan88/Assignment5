package com.company;
import java.util.*;
import java.util.Scanner;

public class A5_8ElementIndex {
    public static void main(String[] args){
        Vector a=new Vector();
        a.add(1);a.add(2);
        a.add("java");a.add("Vector");
        System.out.println("Index of java is: "+a.indexOf("Vector"));
    }
}
