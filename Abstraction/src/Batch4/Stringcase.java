package Batch4;

import java.util.Scanner;

public class Stringcase 
{
public static void main(String [] args)

{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int[] a=new int[26];
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i)%64;
		System.out.print(s.charAt(i)+a[c%64]++);
	}
}
}
