import java.util.*;
public class DemoDE {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int countodd = 0, counteven = 0, s1 = 0;
        System.out.println("Enter size of the Array : ");
        s1 = sc.nextInt();
        int a[] = new int[s1];
        System.out.println("Enter array Elements: ");
        for (int i = 0; i < s1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Entered Array: ");
        for (int j = 0; j < s1; j++) {
            System.out.println(a[j]);
        }

        for (int i = 0; i < s1; i++) {
            if (a[i]%2==0){
                counteven += 1;
            }
            else {
                countodd += 1;
            }
        }
        System.out.println("Even numbers in Array: "+ counteven);
        System.out.println("Odd numbers in Array: "+ countodd);
    }


}
