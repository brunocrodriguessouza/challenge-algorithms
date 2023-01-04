package com.challenges;


import java.util.HashMap;
import java.util.Map;


public class FistNotRepeatingCharacter {
    public static void main(String[] args) {
        System.out.print(fistNotRepeatingCharacter("abacabad"));
    }

    private static char fistNotRepeatingCharacter(String input){
        Map<Character, Integer> map = new HashMap();

        for (Character character : input.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        for (Character c : input.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        return '_';
    }
}
