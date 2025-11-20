package week3;
import java.util.Scanner;


/**
 * Write a description of class HourConversionQ4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HourConversionQ4
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value: ");
        long totalSec= sc.nextLong();
        long Hour= totalSec /3600;
        long Remaining= totalSec %3600;
        long Minutes= Remaining /60;
        long Seconds= Remaining %60;
        System.out.println("Hour: "+Hour+"\nMintues: "+Minutes+"\nSeconds: "+Seconds);
        
    }
}