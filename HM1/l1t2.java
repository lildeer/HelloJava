package HM1;

import java.util.ArrayList;

// Вывести все простые числа от 1 до 1000
public class l1t2 {
    public static void main(String[] args) {

        final int N = 1000;

        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < N + 1; i++) {
            a.add(i);
        }
        
        a.set(1, 0);
        
        int i = 2;
        int j = 0;
        while (i <= N) {
            if (a.get(i) != 0) {
                j = i + i;
                while (j <= N) {
                    a.set(j, 0);
                    j = j + i;
                }
            }
            i++;
        }
        while (a.contains(0)) {
            a.remove(a.indexOf(0));
        }
        for (Integer k : a) {
            System.out.printf("%d ", k);
            
        }
        }


    }

