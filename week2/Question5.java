package week2;

import java.util.Scanner;

/**
 * Write a description of class Question5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question5
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First_Number");
        int First_Number=sc.nextInt();
        System.out.println("Enter the Second_Number");
        int Second_Number=sc.nextInt();
        int Sum= First_Number+Second_Number;
        int Diff= First_Number-Second_Number;
        int Multi= First_Number*Second_Number;
        int Div= First_Number/Second_Number;
        int Remn=First_Number%Second_Number;
        System.out.println("Sum of Two Number: "+Sum);
        System.out.println("Diff of Two Number: "+Diff);
        System.out.println("Multi of Two Number: "+Multi);
        System.out.println("Div of Two Number: "+Div);
        System.out.println("Remn of Two Number: "+Remn);
    
        
    }
}