package code;
import java.util.*;
public class Number {

	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if((n>0)&&(n<10))
		{
			System.out.println(n);
		}
		else
		{
			System.out.println("you entered number is not in range");
		}
			
		

	}

}
