import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int n ;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int revnumber = 0;
        while(n != 0){
            int lastdigit = n % 10;
            n = n / 10;
            revnumber = (revnumber * 10) + lastdigit;
        }

        System.out.println("The Reverse of the number is: " + revnumber);
    }

}
