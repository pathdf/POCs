import java.util.Scanner;
import java.io.IOException;
public class WebKulPattern2
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int iteration=0;
		for(int i=1;i<=n;i++)
		{
			iteration +=i+1;
		}
		
		int track = iteration;
		int sub=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=iteration;j++)
			{
				if(j==track)
				{
					if(iteration==j) sub=0;
					System.out.print("*");
					track+=sub;
					sub++;
				}
					
				else
					System.out.print(" ");
			}
			
			for(int k=0;k<i;k++)
			{
				
				track-=(n+1-k);
				sub=(n+1-k);
			}
			
			System.out.println();
		}
		for(int i=1;i<=iteration;i++)
			System.out.print("*");
		System.out.println();
		
		track=2;
		sub=track;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=iteration;j++)
			{
				if(track==j)
				{
					sub++;
					if(j==iteration)sub=0;
					System.out.print("*");
					track+=sub;
						
				}
				else
					System.out.print(" ");
			}
			
			for(int k=i+1;k<n;k++)
			{
				track-=(n+1-(k-(i+1)));
				sub=(n+1-(k-(i+1)))-1;
			}
		
			System.out.println();
		}

	}
	
	
	
}