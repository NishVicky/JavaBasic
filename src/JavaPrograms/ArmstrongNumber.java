package JavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	////---------Arm strong no ----------Ex 0,1,153,370,371,407 are only arm strong no-- 
		//- Ex 153 = Cube of 1 + cube of 5 + cube of 3 = 153
			// means - 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153 it arm strong
			// Ex - 145 = 1 * 1 * 1 + 4 * 4 * 4 + 5 * 5 * 5 = 190 It is not arm strong no.
			int num, rem, sum = 0;
			System.out.print("Enter number : ");
			num = Integer.parseInt(new Scanner(System.in).nextLine());
			for (int i = num; i > 0; i = i / 10)
			{
				rem = i % 10;
				sum = sum + rem * rem * rem;
			}
			if (num == sum)
			{
				System.out.print("\n number is arm strong");
			}
			else
			{
				System.out.print("\n number is not arm strong ");
			}
	}

}
