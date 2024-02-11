package Mypackage;

public class abc{
	
	public int m1(int a[]){
	int res=0;
	for(int i:a)
		res+=i;	
	return res;
	}
		public static void main(String argos[]){
		abc obj=new abc();
		System.out.println(obj.m1(new int[]{1,2,3,4}));
	     }
	}

