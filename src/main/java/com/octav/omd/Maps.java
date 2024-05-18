package com.octav.omd;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map< String, String> myMap = new HashMap<>();

        myMap.put("258544", "Pitt");

        System.out.println(myMap.toString());

        for(Map.Entry<String, String> key:myMap.entrySet()){
            System.out.println(key);
        }

    }


}
