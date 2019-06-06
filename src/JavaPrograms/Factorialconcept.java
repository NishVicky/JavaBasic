package JavaPrograms;

import java.util.Scanner;

public class Factorialconcept {

	public static void main(String[] args) {

	//Factorial of number from user input-Ex When user enter 5 
		//then Factorial of 5 is :-5 * 4 * 3 * 2 * 1 = 120	
		int fact = 1, num;
		System.out.print("Enter number : ");
		num = Integer.parseInt(new Scanner(System.in).nextLine());
		fact = num;
		for (int i = 1; i < num; i++)
		{
			fact = fact * i;
		}
		System.out.printf("%1$s", fact);

	}

}
