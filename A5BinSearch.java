package com.company;
import java.util.Scanner;
public class A5BinSearch {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        System.out.print("Enter any number to search: ");
        int x=s.nextInt();
        int l=arr.length;
        int up=l-1,low=0;
        int middle,k=-1;
        while(up>=low){
            middle=(up+low)/2;
            if(x>arr[middle]){
                low=middle+1;
            }
            else if(x<arr[middle]){
                up=middle-1;
            }
            else{
                k=middle;
                break;
            }
        }
        if(k!=-1)
        System.out.println("Yes,"+x+" is present in the array");
        else{
            System.out.println(x+" is not present in the array");
        }
    }
}
