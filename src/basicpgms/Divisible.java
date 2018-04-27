package basicpgms;

import java.util.Scanner;

public class Divisible 
{
	public static String isDivisible(int num)
	{
		String res="not matching";
		if((num%3==0)&& (num%7==0))
		{
			res="FizzBuzz";
		}
		else if(num%3==0)
		{
			res="Fizz";
		}
		else if(num%7==0)
		{
			res="Buzz";
		}
		return res;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		String res = isDivisible(n1);
		System.out.println(res);
		
		

	}

}
