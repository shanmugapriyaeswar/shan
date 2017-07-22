package code;

import java.util.Scanner;

public class Withoutcompare {

	public static void main(String[] args) 
	{
		String str1;
		String str2;
		Scanner s=new Scanner(System.in);
		str1=s.nextLine();
		str2=s.nextLine();
	
		if(str1.equals(str2))
		{
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("strings are not equal");
		}

	}

}
