package operaterspgm;

public class IncrementDecrement 
{
	public static void main(String[] args)
	{
		
		int x=0;
		int y=0;
		//for loop 1st
		for(int z=0;z<5;z++)
		{
			if((++x)>2 && (++y)>2)
			{
				x++;
			}
		}
		System.out.println(x+","+y);

	}
}
