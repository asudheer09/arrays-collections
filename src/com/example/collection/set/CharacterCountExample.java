package com.example.collection.set;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountExample {
    public static void main(String[] args) {
        String word="hello";

        Map<Character,Integer> charCount= new HashMap<Character, Integer>();

        char[] chars= word.toCharArray();

        for (Character c: chars ) { //h
            if(charCount.containsKey(c)){
                charCount.put(c,charCount.get(c)+1);
            }else {
                charCount.put(c, 1);
            }
        }

        System.out.println(charCount);
    }

    }

