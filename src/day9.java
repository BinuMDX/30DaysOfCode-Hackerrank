import java.io.*;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;



public class day9 {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);

        System.out.println(result);

        in.close();
    }

    public static int factorial(int n) {
        if(n>1){
            return n* factorial(n-1);
        } else {
            return 1;
        }

    }
}
