package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class MinimumTimeToMakeRopeColorful {

    public static void main(String[] args) {
        MinimumTimeToMakeRopeColorful solution = new MinimumTimeToMakeRopeColorful();
        int[] neededTime = {1, 2, 3, 4};
        String colors = "RGBR";

        int result = solution.minCost(colors, neededTime);
        System.out.println("Minimum time to make the rope colorful: " + result);
    }
        public int minCost(String colors, int[] neededTime) {
            int needed=0;
            int n=neededTime.length;
            char[] ch=colors.toCharArray();
            int cur_max=neededTime[0];

            for(int i=1;i<n;i++){
                if(ch[i-1]!=ch[i]){
                    cur_max=neededTime[i];
                }
                else{
                    needed+=Math.min(cur_max, neededTime[i]);
                    cur_max=Math.max(cur_max, neededTime[i]);
                }
            }
            return needed;
        }
    }
