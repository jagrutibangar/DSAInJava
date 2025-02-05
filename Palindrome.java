import java.util.Scanner;

public class Palindrome {
    static int revnumber = 0;

    public static void revnum(int n) {
        while (n != 0) {
            int lastdigit = n % 10;
            n = n / 10;
            revnumber = (revnumber * 10) + lastdigit;
        }
    }

    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        revnum(n);

        if (n == revnumber){
            System.out.println("Number is Palindrome");
        }


    }
}
