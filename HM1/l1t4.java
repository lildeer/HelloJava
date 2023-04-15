package HM1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class l1t4 {

     
    // Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
    // например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
    // Предложить хотя бы одно решение или сообщить, что его нет.
    // Под знаками вопросов - одна и та же цифра Ввод: 2? + ?5 = 69 Вывод: 24 + 45 = 69
    // 2? + ?5 = 69
    // ?7 + ?5 = 32
    // 1? + 30 = 4?
    
    public static void main(String[] argStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: q + w = e");
        String str = sc.nextLine();
        List<String> qwe = getarg(Arrays.asList(str.split(" ")));
        Solution(qwe);
        sc.close();

    }
    public static List<String> getarg(List<String> parts) {
        List<String> onlyarg = new ArrayList<>();
        for (int i = 0; i < parts.size(); i++) {
            if (i % 2 == 0) {                   //0 1 2 3 4 - числа будут только на четных позициях
                onlyarg.add(parts.get(i));      //q + w = e
            }
        }
        return onlyarg;
    }

    public static void Solution(List<String> qwe) {
        String qArg = qwe.get(0);
        String wArg = qwe.get(1);
        String eArg = qwe.get(2);

        boolean isQArgWithQ = containsQ(qArg);
        boolean isWArgWithQ = containsQ(wArg);
        boolean isEArgWithQ = containsQ(eArg);

        boolean noSol = true;
        for (int i = 0; i <= 9; i++) {
            int q,w,e;
            q = getArgAsInt(qArg, isQArgWithQ, i);
            w = getArgAsInt(wArg, isWArgWithQ, i);
            e = getArgAsInt(eArg, isEArgWithQ, i);

            if (q + w == e) {
                noSol = false;
                System.out.println(q + " + " +  w + " = " + e);
            }
        }

        if (noSol) {
            System.out.println("No solutions.");
        }
    }

    public static int getArgAsInt(String arg, boolean isArgWithQ, int currentI) {
        if (isArgWithQ) {
            return Integer.parseInt(arg.replace("?", String.valueOf(currentI)));
        }

        return Integer.parseInt(arg);
    }

    public static boolean containsQ(String arg) {
        return arg.contains("?");
    }

}
//не полностью мое, помогал сокурсник