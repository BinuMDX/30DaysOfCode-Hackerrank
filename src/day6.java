import java.io.*;
import java.util.*;

public class day6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        sc.nextLine();

        String arr[] = new String[t];

        for(int i = 0; arr.length > i; i++) {
            arr[i] = sc.nextLine();
        }

        //print output
        for(int temp = 0; temp<t; temp++){
            for(int j = 0; j<arr[temp].length(); j = j+2)
            {
                System.out.print(arr[temp].charAt(j));
            }

            System.out.print(" ");

            for(int j = 1; j<arr[temp].length(); j = j+2){
                System.out.print(arr[temp].charAt(j));
            }

            System.out.println();
        }

        sc.close();
    }
}