import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        int n ;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int arm = 0 ;
        if (n == 0){
            System.out.println(0);
        }
        while(n !=0 ){
            int d = n % 10;
            n = n /10;
            arm = arm + (d*d*d);
        }
        System.out.println("Armstrong : " + arm);
    }
}
