package org.example.leetcode.test2;

import java.util.PriorityQueue;

public class DoorUsage {
    class Person implements Comparable<Person> {
        int time;
        int direction;
        int index;

        public Person(int time, int direction, int index) {
            this.time = time;
            this.direction = direction;
            this.index = index;
        }

        @Override
        public int compareTo(Person other) {
            if (this.time != other.time) {
                return this.time - other.time;
            } else {
                return other.direction - this.direction;
            }
        }
    }

    public int[] getDoorUsageTimes(int[] arrival, int[] direction) {
        int n = arrival.length;
        int[] result = new int[n];
        PriorityQueue<Person> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(new Person(arrival[i], direction[i], i));
        }

        int lastUseTime = 0;
        int lastDirection = 1; // door starts with 'in' position
        while (!pq.isEmpty()) {
            Person person = pq.poll();
            if (person.time > lastUseTime || person.direction == lastDirection) {
                lastUseTime = Math.max(lastUseTime, person.time);
                lastDirection = person.direction;
            } else {
                person.time = lastUseTime + 1;
                pq.offer(person);
                continue;
            }
            result[person.index] = lastUseTime;
            lastUseTime++;
        }

        return result;
    }

}
