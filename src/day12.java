import java.io.*;
import java.util.*;

class Person{
    private String firstName;
    private String lastName;
    private int idNumber;

    Person(String firstName,String lastName, int idNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    char calculate(){
        int count = 0;
        float avgMarks;

        for(int i = 0; i< testScores.length; i++){
            count = count + testScores[i];
        }

        avgMarks = count/ testScores.length;

        if(avgMarks>= 90){
            return 'O';
        }else if(avgMarks >= 80){
            return 'E';
        }else if (avgMarks >= 70){
            return 'A';
        }else if(avgMarks >=55){
            return 'P';
        }else if(avgMarks>= 40){
            return 'D';
        }else {
            return 'T';
        }

    }
}


public class day12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: "+ s.calculate() );
    }
}
