package com.bootcoding.dsa.LeetCode.pattern;

import java.util.ArrayList;
import java.util.List;
public class PascalsTriangle {
    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        int rowIndex1 = 3;
        List<Integer> row1 = pascalsTriangle.getRow(rowIndex1);
        System.out.println("Row " + rowIndex1 + ": " + row1);
     }
        public List<Integer> getRow(int rowIndex) {
            List<Integer> row = new ArrayList<>();

            for (int i = 0; i <= rowIndex; i++) {
                row.add(0, 1);
                for (int j = 1; j < row.size() - 1; j++) {
                    row.set(j, row.get(j) + row.get(j + 1));
                }
            }

            return row;
        }


    }


