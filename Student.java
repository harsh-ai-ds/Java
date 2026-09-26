/*Write a Java program to accept a student's marks and display Grade A, B, C, or Fail using nested if-else statements.*/
import java.util.Scanner;
public class Student{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first student marks:");
        int marks = sc.nextInt();
        if(marks >= 35){
            if(marks>=85){
                System.out.println("Grade A:");    
            }else if(marks>=65){
                System.out.println("Grade B:");
            }else if(marks>=35){
                System.out.println("Grade C:");
            }
        }else{
            System.out.println("fail:");
        }
        sc.close();
    }
}
