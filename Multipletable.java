package code;
import java.util.*;
public class Multipletable {

	public static void main(String[] args) 
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=10;++i)
		{
			int a=i*n;
			System.out.println(+i+"*"+n+"="+a);
		}
		
s.close();
	}

}
