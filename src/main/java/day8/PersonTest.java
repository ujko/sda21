package day8;

import java.util.*;

public class PersonTest {

    public static void main(String[] args) {
        int[] a = new int[6];
        a[0] = 3;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 5;
        a[5] = 5;
        System.out.println(podajPusty(a));
    }

    private static int podajPusty(int[] a) {
        Set<Integer> set = new TreeSet<>();
        for(int x : a) {
            set.add(x);
        }
        int i = 1;
        for (int x : set) {
            if(x!=i++) {
                return --i;
            }
        }
        return i;
    }
}
