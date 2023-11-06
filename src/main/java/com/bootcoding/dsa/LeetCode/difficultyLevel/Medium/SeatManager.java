package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import java.util.PriorityQueue;
public class SeatManager {
    public static void main(String[] args) {
        SeatManager seatManager = new SeatManager(5); // Initialize with 5 seats

        int reservedSeat1 = seatManager.reserve(); // Reserve seat 1
        int reservedSeat2 = seatManager.reserve(); // Reserve seat 2
        seatManager.unreserve(reservedSeat1); // Unreserve seat 1
        int reservedSeat3 = seatManager.reserve(); // Reserve a previously unreserved seat

        System.out.println("Reserved Seat 1: " + reservedSeat1);
        System.out.println("Reserved Seat 2: " + reservedSeat2);
        System.out.println("Reserved Seat 3: " + reservedSeat3);
    }
        private int last;
        private PriorityQueue<Integer> pq;

        public SeatManager(int n) {
            this.last = 0;
            this.pq = new PriorityQueue<>();
        }

        public int reserve() {
            if (pq.isEmpty()) {
                return ++last;
            } else {
                return pq.poll();
            }
        }

        public void unreserve(int seatNumber) {
            if (seatNumber == last) {
                --last;
            } else {
                pq.offer(seatNumber);
            }
        }


    }

