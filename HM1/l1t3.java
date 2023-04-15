package HM1;

import java.util.Scanner;
// Реализовать простой калькулятор

// Введите первое число: 12
// Введите операцию: +
// Введите второе число: 1
// Ответ: 13
public class l1t3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter operator: ");
        Character op = StringToChar(sc.next());

        System.out.print("Enter 2d number: ");
        int b = sc.nextInt();

        switch (op) {
            case '+':
                System.out.printf("%d %s %d = %d", a, op, b, Sum(a, b));
                break;

            case '-':
                System.out.printf("%d %s %d = %d", a, op, b, Sub(a, b));
                break;

            case '*':
                System.out.printf("%d %s %d = %d", a, op, b, Mult(a, b));
                break;

            case '/':
                System.out.printf("%d %s %d = %.2f", a, op, b, Div(a, b));
                break;

            default:
                System.out.println("Error");
                break;

        }
        sc.close();

    }

    static int Sum(int x, int y) {
        return x + y;
    }

    static int Sub(int x, int y) {
        return x - y;
    }

    static int Mult(int x, int y) {
        return x * y;
    }

    static double Div(int x, int y) {
        return (double) x / y;
    }

    public static char StringToChar(String s) {
        return s.charAt(0);
    }
}
