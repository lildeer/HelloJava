package HW4;

import java.util.Deque;
import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
public class t1 {
    public static void main(String[] args) {
        final int n = 10;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        LinkedList<Integer> listReversed = Reverse(list);
        System.out.println(list);
        System.out.println(listReversed);

    }

    // технически работает :D
    static LinkedList<Integer> Reverse(LinkedList<Integer> list) {
        Deque<Integer> temp = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            temp.push(list.get(i));
        }
        LinkedList<Integer> result = new LinkedList<>();
        while (!temp.isEmpty()) {
            result.add(temp.pop());
        }
        return result;

    }
}
