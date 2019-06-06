package JavaPrograms;

import java.io.IOException;

public class Primenumber {

	public static void main(String[] args) throws IOException {
	/////// Program of prime Number by given range   
		//Prime is number which only divisible by 1 and itself like 2, 3,5,7,11 etc. 2 is only digit that is prime as well as composite.
			int count = 0;
			System.out.print("Prime no is :- ");
			for (int i = 2; i <= 100; i++)
			{
				for (int j = 2; j <= 100; j++)
				{
					if (i % j == 0)
					{

						count++;
					}

				}
				if (count == 1)
				{
					System.out.print(" ");
					System.out.print(i);
				}
				count = 0;
			}
			System.in.read();
		}
	}


