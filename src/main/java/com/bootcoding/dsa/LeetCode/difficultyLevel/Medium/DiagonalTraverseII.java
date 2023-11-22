package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import java.util.ArrayList;
import java.util.List;
public class DiagonalTraverseII {



    public static void main(String[] args) {
         DiagonalTraverseII diagonalTraverseII = new DiagonalTraverseII();

        List<List<Integer>> nums = new ArrayList<>();
        nums.add(List.of(1, 2, 3));
        nums.add(List.of(4, 5, 6));
        nums.add(List.of(7, 8, 9));

        int[] result = diagonalTraverseII.findDiagonalOrder(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
        public int[] findDiagonalOrder(List<List<Integer>> nums) {
            List<List<Integer>> res = new ArrayList<>();
            int m = nums.size(), size = 0;

            // Traverse the matrix and populate the result list
            for (int i = 0; i < m; i++) {
                int n = nums.get(i).size(), x = i;
                for (int j = 0; j < n; j++) {
                    if (res.size() == x) {
                        res.add(new ArrayList<>());
                    }
                    res.get(x).add(nums.get(i).get(j));
                    x++;
                    size++;
                }
            }

            int[] ans = new int[size];
            int idx = 0;

            // Traverse the result list and fill the output array
            for (int i = 0; i < res.size(); i++) {
                for (int j = res.get(i).size() - 1; j >= 0; j--) {
                    ans[idx] = res.get(i).get(j);
                    idx++;
                }
            }
            return ans;
        }

    }

