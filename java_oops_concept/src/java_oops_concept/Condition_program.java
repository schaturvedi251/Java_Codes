package java_oops_concept;

import java.util.Scanner;

public class Condition_program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");

		int n = sc.nextInt();

		if (n % 2 == 0) 
		{
			if (n % 3 == 0) 
			{
				if (n % 5 == 0) 
				{
					System.out.println("Divisible by all");
				} 
				else 
				{
					System.out.println("Divisible by 2 and 3");
				}
			} 
			else if (n % 5 == 0)
			{
				System.out.println("Divisible by 2 and 5");
			} 
			else 
			{
				System.out.println("Divisible by only 2");
			}
		}
		else if (n % 3 == 0)
		{
			if (n % 5 == 0) 
			{
				System.out.println("Divisible by 3 and 5");
			} 
			else 
			{
				System.out.println("Divisible by only 3");
			}
		}
		else if (n % 5 == 0) 
		{
			System.out.println("Divisible by only 5");
		} 
		else 
		{
			System.out.println("Not Divisible by 2 and 3 and 5");
		}
		sc.close();
	}

}