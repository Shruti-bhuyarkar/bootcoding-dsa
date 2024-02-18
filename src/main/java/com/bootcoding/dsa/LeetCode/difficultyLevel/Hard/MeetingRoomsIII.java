package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

import java.util.Arrays;

public class MeetingRoomsIII {

        public static void main(String[] args) {
            MeetingRoomsIII meetingRoomsIII = new MeetingRoomsIII();

            // Example usage
            int n = 3;
            int[][] meetings = {{1, 3}, {2, 4}, {3, 5}, {4, 6}, {5, 7}};
            int result = meetingRoomsIII.mostBooked(n, meetings);

            System.out.println("The room with the most booked meetings is Room " + result);
        }


        public int mostBooked(int n, int[][] meetings) {
            int[] ans = new int[n];
            long[] times = new long[n];
            Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

            for (int i = 0; i < meetings.length; i++) {
                int start = meetings[i][0], end = meetings[i][1];
                boolean flag = false;
                int minind = -1;
                long val = Long.MAX_VALUE;
                for (int j = 0; j < n; j++) {
                    if (times[j] < val) {
                        val = times[j];
                        minind = j;
                    }
                    if (times[j] <= start) {
                        flag = true;
                        ans[j]++;
                        times[j] = end;
                        break;
                    }
                }
                if (!flag) {
                    ans[minind]++;
                    times[minind] += (end - start);
                }
            }

            int maxi = -1, id = -1;
            for (int i = 0; i < n; i++) {
                if (ans[i] > maxi) {
                    maxi = ans[i];
                    id = i;
                }
            }
            return id;
        }
    }


