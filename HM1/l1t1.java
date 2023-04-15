package HM1;
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class l1t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int nTriangle = Triangle(n);
        int nFact = Fact(n);
        System.out.printf("%d,  %d", nTriangle, nFact);
        sc.close();
    }

    public static int Fact(int x) {
        int i = 1;
        while (x > 1) {
            i = i*x--;
        }
        return i;
    }
    public static int Triangle(int x) {
        int i = 0;
        while (x > 0) {
            i = i+x--;
        }
        return i;
    }
}
