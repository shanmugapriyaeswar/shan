package reference;

import java.util.Scanner;

public class Subset {

	public static void mainpgm(int arr[],int arr1[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("Not a subset");
				System.exit (0);
			}
			
		}
		System.out.println("array1 is subset of array2");
	
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array");
		int len=s.nextInt();
		System.out.println("Enter the second array");
		int len1=s.nextInt();
		int arr[]=new int[len];
		int arr1[]=new int[len1];
		System.out.println("Enter the array elements");
		for(int i=0;i<len;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the array2 elements");
		for(int j=0;j<len1;j++)
		{
			arr1[j]=s.nextInt();
			
		}
		mainpgm(arr,arr1);
		s.close();
		
	}
	

}
