package com.bootcoding.dsa.LeetCode.Array;
import java.util.Arrays;
public class MedianTwoSortedArrays {
        public static void main(String[] args) {
            int[] nums1 = {1, 3};
            int[] nums2 = {2};
            double median = findMedianSortedArrays(nums1, nums2);
            System.out.println("Median: " + median);
        }
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n = (nums1.length + nums2.length);
            int[] c = new int[n];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (i <= nums1.length - 1) {
                    c[i] = nums1[i];
                } else {
                    c[i] = nums2[j++];
                }
            }
            Arrays.sort(c);
            int m = c.length;
            int o = m / 2;
            if (m % 2 == 0) {
                double p = c[o];
                double q = c[o - 1];
                double r = ((p + q) / 2);
                return r;
            } else {
                double s = c[o];
                return s;
            }
        }
    }


