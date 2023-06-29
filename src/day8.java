import java.util.*;
import java.io.*;

class day8{
    public static void main(String []args){
        Map<String, Integer> Phonebook = new HashMap<String, Integer>();


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();

            Phonebook.put(name,phone);

        }
        while(in.hasNext()){
            String s = in.next();
            if (Phonebook.get(s) == null){
                System.out.println("Not Found");
            }else {
                System.out.println(s + "=" + Phonebook.get(s));
            }
        }
        in.close();


    }
}