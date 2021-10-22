package com.interviewquestions;

public class Pattern {
public static void main(String[] args) {
	bringPattern();
}
public static void bringPattern()
{
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)
			System.out.print("*"+"");
		System.out.println();
	}
}
}
