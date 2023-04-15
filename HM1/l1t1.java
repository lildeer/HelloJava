package HM1;

import java.util.Scanner;

public class l1t1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        int nTriangle = Triangle(n);
        int nFact = Fact(n);
        System.out.printf("%d,  %d", nTriangle, nFact);
        scan.close();
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
