package ArrayandArrayLists;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        //declaration of array
        // datatype[] variable_name = new datatype[size];

        //Store 5 roll numbers
        int[] rolls = new int[5];

        // int[] rolls ; --  declaration of rolls array, rolls is getting defined in the heap memory
        // rolls = new int[5]; -- initialisation her object is being created in the memory

        String s = Arrays.toString(new String[8]);
        System.out.println(s);


        }
}
