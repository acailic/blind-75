package org.example.leetcode.test2;

public class NewYearChaos {

    public class Main {

    /*    The problem is about a queue of people, each person has a number and they can bribe the person in front of them to swap places. However, each person can only bribe others at most 2 times. The task is to find out the minimum
        number of bribes that must have happened for the queue to get into its current state.*/
        // int[] q - is the queue, where q[i] is the original
    // position of the person who has number i+1
        static void minimumBribes(int[] q) {
            int bribes = 0;
            for (int i = q.length - 1; i >= 0; i--) {
                if (q[i] - (i + 1) > 2) { // places moved forward more than 2
                    System.out.println("Too chaotic");
                    return;
                }
                for (int j = Math.max(0, q[i] - 2); j < i; j++) // check how many times a person has bribed
                    if (q[j] > q[i]) bribes++;
            }
            System.out.println(bribes);
        }

        public static void main(String[] args) {
            int[] q = {2, 1, 5, 3, 4};
            minimumBribes(q);  // Output: 3
        }
    }

}
