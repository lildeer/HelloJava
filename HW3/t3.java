package HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class t3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        final int n = 10;
        Random rd = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            arr.add(rd.nextInt(100));
        }
        System.out.println(arr);
        
        System.out.println(Max(arr));
        System.out.println(Min(arr));
        System.out.println(Sred(arr));

    }

    static Integer Max(ArrayList<Integer> arr) {
        return Collections.max(arr);
    }

    static Integer Min(ArrayList<Integer> arr) {
        return Collections.min(arr);
    }

    static Double Sred(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return ((double) sum / arr.size());
    }
}
