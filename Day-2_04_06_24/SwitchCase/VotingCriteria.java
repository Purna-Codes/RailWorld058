package SwitchCase;

import java.util.Scanner;

public class VotingCriteria 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a valid age");
		int age=sc.nextInt();
		System.out.println("Age is"+" "+age);
		int y=age>=18? 1:0;
		switch (y) 
		{
		case 1: 
		{
			System.out.println("Eligible to vote");
			break;
		}
		case 0: 
		{
			System.out.println(" Not Eligible to vote");
			break;
		}
		default:
			System.out.println("Not a valid entry");
		}
		sc.close();
	}
}
