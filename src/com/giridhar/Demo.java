package com.giridhar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
	Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		Demo demo = new Demo();
		demo.listInfo();
		demo.printInfo();
	}

	public void printInfo() 
	{
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("The table of "+ num +" "+" is : ");
		for(int i=1;i<=10;i++) 
		{
			System.out.print(num*i+" ");
		}
	}
	
	public void listInfo() 
	{
		
		List<String> list = new ArrayList<String>();
		list.add("Giridhar");
		list.add("Reshma");
		list.add("India");
		list.add("Girishma");
		list.add("MeghaGiri");
		System.out.println("List of your name is : ");
		System.out.println(list);
	}
}
