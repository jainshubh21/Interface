
public class UseIcallback implements Icallback
{
	public int callback(int var1)
	{
		System.out.println("I am in callBack");
		return var1;
	}
	
	public static void main(String arg[])
	{
		/*UseIcallback icb = new UseIcallback();
		System.out.println("Returned value: " + icb.callback(199));*/
		
		Icallback icb = new UseIcallback();
		System.out.println("Returned value: " + icb.callback(199));
	}

}
