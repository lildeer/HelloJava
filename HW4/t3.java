package HW4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// В калькулятор добавьте возможность отменить последнюю операцию.
public class t3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);
        Deque<Double> memo = new LinkedList<>();
        memo.add(Double.parseDouble(sc.nextLine()));
        boolean stop = false;
        String op = "";
        int temp = 0;
        while (!stop) {
            System.out.print("Op: ");
            op = sc.nextLine();
            if (op.equals("stop")) {
                stop = true;
            } else {
                if (op.equals("cancel")) {
                    memo.pollLast();
                    System.out.println(memo.peekLast());
                } else {
                    temp = Integer.parseInt(sc.nextLine());
                    Calc(memo, op, temp);
                }
            }

            //снизу можно раскомментить вывод памяти после каждой операции
            //System.out.println(memo); 
        }
        sc.close();
    }

    static void Calc(Deque<Double> memo, String op, int temp) {
        switch (op) {
            case "+":
                memo.add(memo.peekLast() + temp);
                System.out.printf("%.0f\n",memo.peekLast());
                break;

            case "-":
                memo.add(memo.peekLast() - temp);
                System.out.printf("%.0f\n",memo.peekLast());
                break;

            case "*":
                memo.add(memo.peekLast() * temp);
                System.out.printf("%.0f\n",memo.peekLast());;
                break;

            case "/":
                memo.add(memo.peekLast() / temp);
                System.out.printf("%.2f\n",memo.peekLast());
                break;

            default:
                System.out.println("Error");
                break;
        }
    }
}
