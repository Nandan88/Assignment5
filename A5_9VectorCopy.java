package com.company;
import java.util.*;

public class A5_9VectorCopy {
    public static void main(String[] args){
        Vector v1=new Vector();
        v1.add(1);v1.add(2);
        v1.add("Vector");v1.add("Java");
        int s=v1.size();
        System.out.println("1st Vector: "+v1);
        Vector v2=new Vector(s);
        for(int i=0;i<s;i++){
            v2.add(v1.get(i));
        }
        System.out.println("Copy of 1st Vector: "+v2);
    }
}
