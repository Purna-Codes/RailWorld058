package SearchAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter elements");
		for(int i=0;i<5;i++)
		{
			 arr[i]=sc.nextInt();
		}
		//Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			 System.out.println(arr[i]);
		}
		
		System.out.println("==================");
		if (arr[arr.length-3]<arr[arr.length-2]||arr[arr.length-2]<arr[arr.length-1])
		{
			System.out.println("3rd largest number is"+" "+arr[arr.length-3]);
		}
		sc.close();
	}
}
