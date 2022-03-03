package com.company;

public class Main {

    public static void main(String[] args) {
       int arr[]={8,9,1,5,11,13,7,4,6,3,12,10,2};
       sort(arr);
    }
    public static int[] sort(int arr[]){
        for(int i = 0; i< arr.length; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println("Iteration "+(i+1)+": ");
            printArray(arr);
        }
        return arr;
    }
    public static void printArray(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
