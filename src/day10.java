import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

      /* Stack stack1 = new Stack();
        int remainder, count = 0;

        while (n>0){
            remainder = n%2;
            n = n/2;
            stack1.push(remainder);
            count++;
        }

        for(int i=0; i<count; i++){
            System.out.print(stack1.pop());
        }*/

        int count = 0;
        while (n>0){
            n = n & (n<<1);
            count++;
        }

        System.out.println(count);


    }
}
