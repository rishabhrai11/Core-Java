package Mypackage;
import java.util.Scanner;
public class StarMix1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j<=(n-1)/2||i-j>=(n-1)/2||j-i>=(n-1)/2||i+j>=3*(n-1)/2)
					System.out.print('*');
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if((i+j>(n-1)/2 && i<=(n-1)/2 && j<=(n-1)/2)|| (i-j<(n-1)/2 && i>=(n-1)/2 && j<=(n-1)/2)||
						(j-i<(n-1)/2 && i<=(n-1)/2 && j>=(n-1)/2)||(i+j<3*(n-1)/2 && i>=(n-1)/2 && j>=(n-1)/2))
					System.out.print('*');
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}