package week3;
import java.util.Scanner;


/**
 * Write a description of class GradeEvaluatorQ2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluatorQ2
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the Grade you Obtained: ");
        int Grade= sc.nextInt();
        String Message= (Grade>=40)?"Pass":"Fail";
        System.out.println("The grade you obtained is: "+Message);
        
    }
}