
public class ImmutableDemo1 
{
	public static void main(String arg[])
	{
		
    	String str1 ="Harish";
    	System.out.println("String Is :"+str1);
    	System.out.println("String Hashcode before concat :"+str1.hashCode());
    	
    	str1.concat("Kumar");
    	System.out.println("String Is :"+str1);
    	System.out.println("String Hashcode after concat :"+str1.hashCode());
    	
    	str1 = str1.concat("Kumar");
    	System.out.println("String Is :"+str1);
    	System.out.println("String Hashcode after concat :"+str1.hashCode());
	}
	
	

}
