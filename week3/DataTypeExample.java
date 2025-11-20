package week3;


/**
 * Write a description of class DataTypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeExample
{
    public static void main(String[] args)
    {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.BYTES);
        System.out.println(Float.SIZE);
        
        byte b=13;
        byte c=14;
        
        byte d=(byte)(b+c);
        
        
        float f=2.33f;
        
        long l=233l;
        
        
        int a=10;
        float g=2.33f;
        double k= 2.44;
        
        int x=(int)(a+g+k);
        
        System.out.println("The value is: "+x);
        
        int y=10;
        int u=4;
        
        float result=(float)y/u;
        System.out.println("The result is: "+result);
        
        
        
        System.out.println("My name is ");
        System.out.println("Buffmomo");
        
        System.out.println("My name is: \n" +"\"Bahubali\""); 


        int length=10;
        int breadth=20;
        
        int perimeter= 2*(length+breadth);
        int area= length*breadth;
        
        System.out.println("The perimeter of rectangle is: "+perimeter+ "\nThe area of rectangle is: "+area);
        
        
        int p= 500;
        int t= 5;
        float r= 2.3f;
        
        float si= ((float)(p*t)*r)/100;
        
        System.out.println("The simple interest is: "+si);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}