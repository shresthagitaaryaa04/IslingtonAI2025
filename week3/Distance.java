package week3;
import java.util.Scanner;


/**
 * Write a description of class Distance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Distance
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value: ");
        long totaldays= sc.nextLong();
        long Year= totaldays /365;
        long Remaining= totaldays %365;
        long Month= Remaining /30;
        long Days= Remaining %30;
        System.out.println("Year: "+Year+"\nMonth: "+Month+"\nDays: "+Days);
        
    }
}