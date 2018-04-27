package patternpgm;

import java.util.Scanner;

public class Charecter {

	public static void main(String[] args) 
	{
		System.out.println("enter the number of matrix");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<n; i++)
		{
			char ch='A';
			for(int j=1;j<=i; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				if(i<=j)
				{
				System.out.print(i+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				if(i>=j)
				{
				System.out.print(i+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		

	}

}
