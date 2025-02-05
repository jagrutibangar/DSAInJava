import java.util.Scanner;

public class DigitExtraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        n = in.nextInt();
        int count = 0;
        while(n != 0){
            int lastdigit = n % 10;
            n = n /10;
            count += 1;
            System.out.println(lastdigit);
        }

        System.out.println("Number of Digits: "+ count);


    }
}
