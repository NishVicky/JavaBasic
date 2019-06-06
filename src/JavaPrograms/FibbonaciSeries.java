package JavaPrograms;

import java.util.Scanner;

public class FibbonaciSeries {

	public static void main(String[] args) {

		
		// ---------Febonesi series from user input 0,1,1,2,3,5,8,13
		int a = 0, b = 1, c = 0, num;
		System.out.print("Enter no  : ");
		num = Integer.parseInt(new Scanner(System.in).nextLine());
		for (int i = 0; i <= num; i++)
		{
			c = a + b;
			System.out.print(a + " ");
			a = b;
			b = c;
		}
	}

}
