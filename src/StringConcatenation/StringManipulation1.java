package StringConcatenation;

public class StringManipulation1 {

	public static void main(String[] args) {
		//String:String is a collection of different charactors.
				String s="My name is Nishant J Shivsharan";
				System.out.println(s.length());//to check size of string
				System.out.println(s.charAt(0));//to get the charactor available on 4th position
				System.out.println(s.charAt(21));//java.lang.StringIndexOutOfBoundsException
				System.out.println(s.indexOf('a'));//1st occurance of a
				System.out.println(s.indexOf('e',6));//2nd occurance of a but this is hard coded.
				System.out.println(s.indexOf('a',s.indexOf('a')+1));//to avoid hardcoded we can use like this
				System.out.println(s.indexOf("Nishant"));
				System.out.println(s.indexOf("j"));//-1
				 System.out.println(s.indexOf("hello"));//-1

				//to compare the two string we use equals method this will return boolean values true/false.
		       //to ignore the case sentive we use equalsIgnoreCase.
/* String s1="My name is Nishant J Shivsharan";
		       System.out.println(s1.equals(s));//true
		       System.out.println(s1.equalsIgnoreCase(s));*/


	}

}
