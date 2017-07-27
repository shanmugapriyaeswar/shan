package code;
import java.util.*;
public class Closetzero {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array element");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		
			{
				if(a[i]+a[i+1]==0)
				{
					System.out.println("The two elements are "+a[i]+a[i+1]);
				}
			}
		s.close();
		}
		
	}


