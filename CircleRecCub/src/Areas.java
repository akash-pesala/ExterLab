import java.util.*;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
          int length=sc.nextInt();
          int Breadth=sc.nextInt();
          RectangleArea(length,Breadth);
          
	}

	public static void RectangleArea(int l, int b)
	{
		System.out.println(l*b);
	}
}
