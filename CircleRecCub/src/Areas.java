import java.util.*;
public class Areas 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("for finding Area of circle press 1:");
		System.out.println("for finding Area of cuboid press 2:");
		int op=sc.nextInt();
		
          if(op==1)
          {     int r;
		        System.out.print("Enter the Radius of circle:");
		        r=sc.nextInt();
		        circle(r);
          }
		
          else if(op==2) 
          {
			int l,b,h;
			System.out.print("Enter Length ,Breath and Height of cuboid:");
			l=sc.nextInt();
			b=sc.nextInt();
			h=sc.nextInt();
			cuboid(l,b,h);
		
          }
		sc.close();
		
		}
		
	public static void circle(int r)
	{
		
	    System.out.println("Area of Circle="+3.14*r*r);
	}
	public static void cuboid(int l ,int b,int h)
	 {
		 System.out.println("Area of cuboid="+2*(l*b+b*h+h*l));
	 }
		
}