package patternpgm;

import java.util.Scanner;

public class ExtraVariable {

	public static void main(String[] args) 
	{
		System.out.println("enter the number of matrix");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//3
		for(int i=1;i<=n;i++)
		{
			int k=1;
			for(int j=1;j<=n;j++)
			{
				if((i+j)>=(n+1))
				{
					System.out.print(k+" ");
					k++;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	
	//1
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		
	}
	
	}
}
