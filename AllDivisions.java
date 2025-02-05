import java.util.Scanner;

public class AllDivisions {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if (n == 0) {
            System.out.println(0);
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }

            }

        }
    }
}
