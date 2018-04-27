package basicpgms;

import java.util.Scanner;

public class MonkeyStatus 
{
	public static boolean trouble(boolean aSmile, boolean bSmile)
	{
		boolean res=false;
		if(((aSmile==true)&&(bSmile==true)) || ((aSmile==false)&&(bSmile==false)))
		{
			res=true;
		}
		else
		{
			res=false;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println("enter two monkeys are smiling or not;if smiling: true else false");
		Scanner sc=new Scanner(System.in);
		System.out.print("Monkey1: ");
		boolean m1 = sc.nextBoolean();
		System.out.print("Monkey2: ");
		boolean m2=sc.nextBoolean();
		boolean res = trouble(m1,m2);
		if(res)
		{
			System.out.println("Monkeys are in trouble");
		}
		else
		{
			System.out.println("Both monkeys are not in trouble");
		}
		

	}

}
