package Mypackage;

public class AICDemo {
	public static void main(String args[]) {
		AICInterF obj=new AICInterF()
				{
					public void demo() {
						System.out.println("Demo");
					}
				};
		obj.demo();
	}
}
