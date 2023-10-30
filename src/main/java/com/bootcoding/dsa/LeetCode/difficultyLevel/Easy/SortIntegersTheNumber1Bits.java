package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;
import java.util.Arrays;
public class SortIntegersTheNumber1Bits {

    public static void main(String[] args) {
        SortIntegersTheNumber1Bits sortIntegersTheNumber1Bits = new SortIntegersTheNumber1Bits();

        // Test the sortByBits method
        int[] arr = {3, 8, 7, 1, 2, 6};
        int[] sortedArr = sortIntegersTheNumber1Bits.sortByBits(arr);

        System.out.print("Sorted array by the number of set bits: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

        public int[] sortByBits(int[] arr) {
            Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Arrays.sort(boxedArray, (a, b) -> {
                int countA = Integer.bitCount(a);
                int countB = Integer.bitCount(b);
                return countA == countB ? a - b : countA - countB;
            });
            return Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
        }


    }


