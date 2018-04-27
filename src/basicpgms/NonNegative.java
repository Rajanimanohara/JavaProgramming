package basicpgms;

import java.util.Scanner;

public class NonNegative 
{
	public static boolean nonNegative(int num)
	{
		boolean res=false;
		if(num>0)
		{
			if((num%3==0)||(num%5==0))
			{
				res=true;
			}
			else
			{
				res=false;
			}
		}
		return res=false;
	}
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		boolean res = nonNegative(10);
		System.out.println(res);

		

	}

}
