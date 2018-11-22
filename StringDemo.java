
public class StringDemo 
{
	public static void main(String arg[])
	{
		System.out.println("The String length");
		System.out.println("My Name is Shubham".length());
		
		// String class using byte array...
		byte array[] = {10,20,30,40,50};
		String Barray = new String(array);
		System.out.println("Byte Array String is:"+Barray);
		
		

		// String class using byte array...
		char Array[] = {'a','s','b','d','e'};
		String Carray = new String(Array);
		System.out.println("Char Array String is:"+Carray);
		
		String str = "Shubham JAIn";
		
		System.out.println("String in the upper case will be:" + str.toUpperCase());
		System.out.println("String in the lower case will be:" + str.toLowerCase());
		
		String str1 = "S190020300234";
		System.out.println("Year joined:" +str1.substring(1,3));
		System.out.println("Batch code:" +str1.substring(3,8));
		System.out.println("Student Id:" +str1.substring(8));
		
		String SRecord = "Shubham,2018,S190224,6months";
		String Detail[] = SRecord.split(",");
		System.out.println("Student name:"+Detail[0]);
		System.out.println("Joining Year:"+Detail[1]);
		System.out.println("Batch Code:"+Detail[2]);
		System.out.println("Course Duration:"+Detail[3]);
		
	}


}
