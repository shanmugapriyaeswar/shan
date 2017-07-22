package pro;
import java.util.*;
public class Countwords {

	public static void main(String[] args) 
	{
		int count=0;
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		int len=str.length();
		for(int i=1;i<=len;i++)
		{
			count++;
		}
		System.out.println(count);
		//s.close();

	}

}
