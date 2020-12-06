package com.company;
import java.util.*;

public class A5VectorToArray {
    public static void main(String[] args){
        Vector a=new Vector();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println("Vector: "+a);
        Object arr[]=a.toArray();
        System.out.print("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
