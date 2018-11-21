
public class UseCalculator implements Calculator 
{
	@Override
	public int add(int var1, int var2)
	{
		return var1 + var2;
	}
	
	
	@Override
	public int sub(int var1, int var2)
	{
       return  var1 - var2;
	}
	
	@Override
	public int mul(int var1, int var2)
	{
		return  var1 * var2;
	}
	
	@Override
	public int div(int var1, int var2)
	{
		return var1 / var2;
	}
	
	@Override
	public void display()
	{
		System.out.println("Addition of 2 Variables is:" + this.add(100,200));
		System.out.println("Subtraction of 2 Variables is:" + this.sub(100,200));
		System.out.println("Multiplication of 2 Variables is:" + this.mul(100,200));
		System.out.println("Division of 2 Variables is:" + this.div(400,200));
	}
	
	public static void main(String args[])
	{
		UseCalculator obj = new UseCalculator();
		obj.display();
		Calculator obj1 = new UseCalculator();
		obj1.display();
		Addition adobj = new UseCalculator();
        System.out.println("Addition is: " +adobj.add(100,900));
        //System.out.println("Multiplication is: "+adobj.mul(12,12));  //Error becaus Multiplication is not extended to addition...
	}

}
