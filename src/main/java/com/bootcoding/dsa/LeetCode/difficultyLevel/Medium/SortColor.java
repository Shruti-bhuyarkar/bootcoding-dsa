package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class SortColor {
    public static void main(String[] args) {
        int a[] = {2, 0, 2, 1, 1, 0};
        int []ans = sortColors(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(ans);
        }
    }
    public static int[] sortColors ( int[] a){
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a.length - 1; j++) {
                        if (a[j] > a[j + 1]) {
                            int temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }
                }
                return a;
            }
        }


