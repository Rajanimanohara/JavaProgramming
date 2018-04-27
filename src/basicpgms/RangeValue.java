package basicpgms;

import java.util.Scanner;

public class RangeValue {

	public static boolean isRange(int n1, int n2)
	{
		boolean res=false;
		if(((n1>=30 && n1<=40)&&(n2>=30 && n2<=40))||((n1>=40 && n1<=50)&&(n2>=40 && n2<=50)))
		{
			res= true;
		}
		else
		{
			res=false;
		}
		return res;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("enter two number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		boolean res=isRange(n1,n2);
		if(res)
		{
			System.out.println("both numbers are in range between 30 to 50");
		}
		else
		{
			System.out.println("numbers not in range");
			
		}
		
		

	}

}
