import java.util.Scanner;

/**
 * Write a description of class Question4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Student Name: \n");
        String Name=sc.next();
        System.out.println("Input Student Age: \n");
        int Age=sc.nextInt();
        System.out.println("Input Student Gpa: \n");
        float Gpa=sc.nextFloat();
        System.out.println("Student Name is: "+Name);
        System.out.println("Student Age is: "+Age);
        System.out.println("Student Gpa is: "+Gpa);
        
    }
}