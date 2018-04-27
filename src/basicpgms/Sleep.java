package basicpgms;

import java.util.Scanner;

public class Sleep {

	public static boolean toSleep(boolean weekday,boolean vacation)
	{
		boolean sleep=false;
		if((weekday==false)||(vacation==true))
		{
			sleep=true;
		}
		else
		{
			sleep=false;
		}
		return sleep;
	}
	public static void main(String[] args) 
	{
		System.out.println("enter the type of day ");
		Scanner sc=new Scanner(System.in);
		System.out.print("Weekday: ");
		boolean m1 = sc.nextBoolean();
		System.out.print("Vacation: ");
		boolean m2=sc.nextBoolean();
		boolean res = toSleep(m1,m2);
		if(res)
		{
			System.out.println("Sleep");
		}
		else
		{
			System.out.println("neither vacation nor weekend to Sleep");
		}

	}

}
