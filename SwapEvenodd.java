package pro;
import java.util.*;
public class SwapEvenodd {

	public static void main(String[] args) {
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		String res1="";
		String res2="";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				res1=res1+str.charAt(i);
			}
		}
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				res2=res2+str.charAt(i);
			}
		}
		s.close();
		System.out.println(""+res1);
		System.out.println(""+res2);

	}

}
