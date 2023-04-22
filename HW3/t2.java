package HW3;

import java.util.ArrayList;
import java.util.Random;

public class t2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        final int n = 10;
        Random rd = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int i = 0; i < n; i++) {
            arr.add(rd.nextInt(100));
        }
        System.out.println(arr);
        LostEven(arr);
        System.out.println(arr);
    }
    
    static ArrayList<Integer> LostEven (ArrayList<Integer> arr)
    {
        for (int i = arr.size()-1; i >= 0 ; i--) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }
        return arr;
    }

    }

