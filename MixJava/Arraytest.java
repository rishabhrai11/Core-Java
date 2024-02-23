package Mypackage;

public class Arraytest {
	public void letstest(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			ar[i]=i;
		}
	}
	public static void main(String args[]) {
		Arraytest ob=new Arraytest();
		int a[]=new int[10];
		ob.letstest(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
