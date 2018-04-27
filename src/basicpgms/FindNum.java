package basicpgms;

import java.util.Scanner;

public class FindNum 
{
	public static boolean findTen(int num1,int num2)
	{
		if((num1+num2==10)||(num1==10)||(num2==10))
		{
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) 
	{
		System.out.println("enter two number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		boolean res=findTen(n1,n2);
		if(res)
		{
			System.out.println("sum or either one of the number is 10");
		}
		else
		{
			System.out.println("no 10 value");
			
		}
		

	}

}
