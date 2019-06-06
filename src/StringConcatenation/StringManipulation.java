package StringConcatenation;

public class StringManipulation {

	public static void main(String[] args) {
		//String:String is a collection of different charactors.
		String s="This is a selenium classa";
		System.out.println(s.length());//to check size of string
		System.out.println(s.charAt(5));//to get the charactor available on 4th position
		//System.out.println(s.charAt(21));//java.lang.StringIndexOutOfBoundsException
		System.out.println(s.indexOf('a'));//1st occurance of a
		System.out.println(s.indexOf('a',6));//2nd occurance of a but this is hard coded.
		System.out.println(s.indexOf('a',s.indexOf('a')+1));//to avoid hardcoded we can use like this
        System.out.println(s.indexOf("classa"));
        System.out.println(s.indexOf("Classa"));//-1
       System.out.println(s.indexOf("hello"));//-1

		//to compare the two string we use equals method this will return boolean values true/false.
       //to ignore the case sentive we use equalsIgnoreCase.
       String s1="This is a selenium     Classa";
       System.out.println(s1.equals(s));//true
       System.out.println(s1.equalsIgnoreCase(s));

       
       //trim:we use the trim methods to remove the space after space of before space.
       String str="    Hellow         World";
       System.out.println(str.trim());
       
       //replace
       String date="12-09-1991";
       System.out.println(date.replace('-', '/'));//output:12/09/1991
       
       String str1="Hellow World";
       System.out.println(str1.replace(" ",""));//to remove the space of middle
       
       //sub-string
       String str2="This is selenium class";
       System.out.println(str2.substring(0, 6));
       
       //Split
       /*String str3="This_is_selenium_class";
       String arr[]=str3.split("_");
       System.out.println(arr[0]);
       System.out.println(arr[1]);
       System.out.println(arr[2]);
       System.out.println(arr[3]);*/
       
       
       String str4="XxThisxxisxxseleniumxxclass";
       String arr1[]=str4.split("x");
       for( int i=0;i<arr1.length;i++)
       {
    	   System.out.println(i+"--->"+arr1[i]);
       }
       
       String FirstName="Moni;Sony;adu;pratu";
       String FirstName1[]= FirstName.split(";");
       for(int j=0;j<FirstName1.length;j++)
       {
    	   System.out.println(FirstName1[j]);
       }


	}

}
