package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class ZigzagConversion {
    public static void main(String[] args) {
        // Example usage:
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String input = "PAYPALISHIRING";
        int numRows = 3;
        String result = zigzagConversion.convert(input, numRows);
        System.out.println("Zigzag Conversion: " + result);
    }
        public String convert(String s, int numRows) {
            if (numRows == 1) {
                return s;
            }
            int step = numRows * 2 - 2, size = s.length(), row = 0, index = 0, subStep = step;
            char[] chars = new char[size];
            for (int i = 0; i < size; i++) {
                chars[i] = s.charAt(index);
                if (subStep > 0 && subStep < step && index + subStep < size) {
                    chars[++i] = s.charAt(index + subStep);
                }
                index += step;
                if (index >= size) {
                    index = ++row;
                    subStep -= 2;
                }
            }
            return new String(chars);
        }


    }


