package com.company;

import java.util.*;


public class Main { public static void main(String[] args){
    ArrayList<Integer> arrayList = new ArrayList<>();
    int a;
    for (a = 0; a < 50; a++) {
        arrayList.add(new Random().nextInt(0, 100));
    }
    System.out.println("Random numbers: ");
    for (int j : arrayList) {
        System.out.print(j + ", ");

    }
    System.out.println("\n");
    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
    ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

    for(int i=0;i<arrayList.size();i++){
        if(arrayList.get(i) %2==0){
            evenNumbers.add(arrayList.get(i));
        }else{
            oddNumbers.add(arrayList.get(i));
        }
    }
    Collections.sort(evenNumbers);
    System.out.println("Even numbers: ");
    for(int even : evenNumbers)
        System.out.print(even+", ");
    System.out.println("\n");
    Collections.sort(oddNumbers);

    System.out.println("Odd numbers: ");
    for(int odd : oddNumbers)
        System.out.print(odd+", ");
    }
}