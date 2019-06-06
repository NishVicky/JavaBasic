package JavaPrograms;

import java.util.Scanner;

public class Palindrome {

	//@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		//Palindrowme :It means reverse of number is equal to given number
		//Eg:252,434 =434
				int num, rev = 0, rem, temp;
				System.out.print("Enter number : ");
				num = Integer.parseInt(new Scanner(System.in).nextLine());
				temp = num;
				while (num > 0)
				{
					rem = num % 10;
					rev = rev * 10 + rem;
					num = num / 10;
				}
				//System.out.printf("Palindrome number is :", rev);
				if (temp == rev)
				{
					System.out.println("palindrome number");
				}
				else
				{
					System.out.println("not a palindrome number");
				}
	}

}
