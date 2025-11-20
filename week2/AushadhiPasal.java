package week2;

import java.util.Scanner;

/**
 * Write a description of class AushadhiPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AushadhiPasal
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Store Medicine Name: ");
        String medinfo= sc.next();
        System.out.println("Store Medicine Price per table: Rs. ");
        int medprice= sc.nextInt();
        System.out.println("Store Medicine Stocks: ");
        int medstock= sc.nextInt();
        System.out.println("Medicine Name is: "+medinfo+"\nMedicine Price per table: Rs."+medprice+"\nMedicine Stocks: "+medstock);
        System.out.println("Hello! What Medicine do you need?: ");
        String usermedname= sc.next();
        System.out.println("How much quantity do you need?: ");
        int usermedqty= sc.nextInt();
        int totalprice= medprice*usermedqty;

        System.out.println("Your Total Bill is: "+totalprice);
        
        int remstocks= medstock-usermedqty;
        System.out.println("Remaining Stocks: "+remstocks);
        
        
        
        
    }
}