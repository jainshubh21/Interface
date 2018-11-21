
public class InterfaceDemo1 implements InterfaceDemo 
{
	public static void main(String args[])
	{
	//Left = 12;  // Cant reassign the value as variables of interface are bydefault final and static...
    System.out.println("Value :" +Left);
    int add =10;
    add = add + Left;
    // Left = Left+add;
    System.out.println("Value :" +add);
	}
}
