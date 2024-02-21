package Mypackage;

import java.util.Scanner;

public class Anagram 
{
	 void sort(char a[]) {
		 int i,j;
		 for(i=0;i<a.length;i++) {
			 for(j=0;j<a.length-i-1;j++) {
				 if(a[j]>a[j+1]) {
					 char k=a[j];
					 a[j]=a[j+1];
					 a[j+1]=k;
				 	}
			 	}
		 	}
	 	}
	 
	 public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 Anagram ob1=new Anagram();
		 System.out.println("Enter your strings:");
		 String st1=sc.nextLine();
		 String st2=sc.nextLine();
		 st1=st1.replace(" ","");
		 st2=st2.replace(" ","");
		 if(st1.length()==st2.length()) {
		 st1=st1.toLowerCase();
		 st2=st2.toLowerCase();
		 char s1[]=st1.toCharArray();
		 char s2[]=st2.toCharArray();
		 ob1.sort(s1);
		 ob1.sort(s2);
		 st1="";
		 st2="";
		 for(int i=0;i<s1.length;i++) {
			 st1+=s1[i]+"";
			 st2+=s2[i]+"";
		 }
		 if(st1.equals(st2))
			 System.out.println("Anagram");
		 else 
			 System.out.println("Not Anagram");
	 }
		 else
			 System.out.println("Not Anagram");
	 }
				
}
