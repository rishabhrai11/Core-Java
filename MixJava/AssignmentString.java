package Mypackage;
//
public class AssignmentString {
	public static void main(String args []) {
		String s="PW SKILLS";
		String s1="";
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[arr.length-1-i].length();j++){
				if(i==0)
					s1+=arr[arr.length-1-i].charAt((arr[arr.length-1-i].length())-1-j);
				else
					s1+=arr[arr.length-1-i].charAt(j);
			}
			
		}
		System.out.println("Revised String:"+s1);
	}
}
