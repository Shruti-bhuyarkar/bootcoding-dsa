package com.bootcoding.dsa.LeetCode.Array;

// This is MountainArray's API interface.
// You should not implement it, or speculate about its implementation
interface MountainArray {
    public int get(int index);
    public int length();
}
public class FindInMountainArray {
    public static void main(String[] args) {
        // Create a sample MountainArray for demonstration
        MountainArray mountainArray = new MountainArray() {
            int[] arr = {1, 2, 3, 4, 5, 3, 1};

            public int get(int index) {
                return arr[index];
            }

            public int length() {
                return arr.length;
            }
        };

        FindInMountainArray findInMountainArray = new FindInMountainArray();
        int target = 3;
        int result = findInMountainArray.findInMountainArray(target, mountainArray);
        System.out.println("The target " + target + " is found at index " + result);
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int search = orderAgnostic(mountainArr, target, 0, peak);
        if (search != -1) {
            return search;
        }
        return orderAgnostic(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }
    static int findPeak(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnostic(MountainArray mountainArr, int target, int start, int end) {
        boolean asc = mountainArr.get(start) < mountainArr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) == target) {
                return mid;
            }

            if (asc) {
                if (mountainArr.get(mid) > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (mountainArr.get(mid) < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}


