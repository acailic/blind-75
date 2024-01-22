package org.example.leetcode.test2;

import java.util.Arrays;
import java.util.Comparator;

public class ParkingCars {

    //https://takeitoutamber.medium.com/hackerrank-coding-interview-5-assigned-parking-f74fb68f424f
    // so task is to find the minimum fuel required to park the cars

    public  static void  main(String[] args) {
        int[] x = new int[]{1, 4};
        int[] y = new int[]{1, 4};
        ParkingCars parkingCars = new ParkingCars();
        int res = parkingCars.minFuel1(x, y);
        System.out.println(res);
    }
        // second example
        //
    //    There are n cars located on a 2-dimensional plane at positions (x[i], y[i]) where 0 ≤ i ≤ n. They need to be parked in a straight line parallel to the x-axis with no spaces between them. The fuel consumed to move a car is abs(x[finish] — x[start]) + abs(y[finish] — y[start]). Determine the minimum fuel cost to arrange the cars side-by-side in a row parallel to the x-axis.
//
    // resolve method for text assignment above
    // so the goal x[]-i
    public int minFuel1(int[] x, int[] y) {
        int n = x.length;
        Arrays.sort(x);
        System.out.println("1: "+ Arrays.toString(x));
        for (int i=0;i<n;i++){
            x[i]-=i; //why? because we need to move all cars to one line, so we need to move them to the left
            // line that is parallel to x-axis
        }

        System.out.println("1: "+ Arrays.toString(x));
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println("3: "+ Arrays.toString(y));
        int fuel=0;
        for(int i=0;i< n;i++){
            fuel+= Math.abs(x[i]-x[n/2]); //n/2 -is median
            System.out.println("fuel1: "+fuel);
            fuel+= Math.abs(y[i]-y[n/2]);
            System.out.println("fuel2: "+fuel);

        }
        return fuel;
    }

}
