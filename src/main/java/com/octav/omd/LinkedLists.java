package com.octav.omd;

import java.util.ArrayList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {

        List <Integer> arr = new ArrayList<>();
        arr.add(10);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);

        int count = 0;


        for( int i= 0; i<10;i++){
            count++;

            arr.add(count);

        }
        System.out.println(arr);

        for( int element:arr){
            System.out.println(element);
        }
        System.out.println("The size is: " + arr.size());
    }
}
