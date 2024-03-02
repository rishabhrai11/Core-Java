package Mypackage;

public class Assignment2 {
	public static void main(String args[]) {
		int n=9;
		char a[][]=new char[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j<=(n-1)/2||i-j>=(n-1)/2||(j-i>=(n-1)/2)||i+j>=3*(n-1)/2)
					a[i][j]='*';
				else
					a[i][j]=' ';
			}
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		//System.out.println(a[1].length);
	}
}
