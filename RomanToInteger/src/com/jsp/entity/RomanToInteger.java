package com.jsp.entity;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Create a hashmap to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);

            // If the current value is smaller than the previous value, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "XIV"; // Replace with your Roman numeral input
        int intValue = romanToInt(romanNumeral);
        System.out.println("Integer value of " + romanNumeral + " is " + intValue);
    }
}
