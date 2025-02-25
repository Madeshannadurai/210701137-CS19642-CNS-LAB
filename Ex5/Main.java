import java.util.Scanner;

public class  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Prime Number \"q\": ");
        int q = scanner.nextInt();

        System.out.print("Enter a No \"xa\" which is less than value of q: ");
        int xa = scanner.nextInt();

        System.out.print("Enter a No \"xb\" which is less than value of q: ");
        int xb = scanner.nextInt();

        System.out.print("Enter alpha: ");
        int alpha = scanner.nextInt();

        int ya = power(alpha, xa, q);
        int yb = power(alpha, xb, q);
        int ka = power(yb, xa, q);
        int kb = power(ya, xb, q);

        System.out.println("\nya = " + ya);
        System.out.println("yb = " + yb);
        System.out.println("ka = " + ka);
        System.out.println("kb = " + kb);

        if (ka == kb)
            System.out.println("\nThe secret keys generated by User A and User B are the same.");
        else
            System.out.println("\nThe secret keys generated by User A and User B are not the same.");
    }

    private static int power(int x, int y, int p) {
        int res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }
}
