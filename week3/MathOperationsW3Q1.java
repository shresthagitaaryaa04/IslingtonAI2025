package week3;
import java.util.Scanner;


/**
 * Write a description of class MathOperationsW3Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperationsW3Q1
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the First Number");
        int FNum= sc.nextInt();
        System.out.println("Input the Second Number");
        int SNum= sc.nextInt();
        int Sum= FNum+SNum;
        int Diff= FNum-SNum;
        int Multi= FNum*SNum;
        int Divide= FNum/SNum;
        int Remain= FNum%SNum;
        System.out.println("The Sum is: "+Sum+"\nThe Difference is: "+Diff+"\nThe Multipication is: "+Divide+"\nThe Divide is: "+Divide+"\nThe Remainder is: "+Remain);
                
    }
    
}