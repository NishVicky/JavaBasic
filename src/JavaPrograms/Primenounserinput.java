package JavaPrograms;

import java.util.Scanner;

public class Primenounserinput {

	public static void main(String[] args) {
		
		int k = 0, number;
		System.out.print("Enter no : ");
		number = Integer.parseInt(new Scanner(System.in).nextLine());
		for (int i = 2; i <= number; i++)
		{
			if (number % i == 0)
			{
				k++;
			}
		}
		if (k == 1)
		{
			System.out.print(" Prime number");
		}
		else
		{
			System.out.print(" Not a prime number");
		}

	}

}
