import java.util.Scanner;
class  Digitornot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
	if((ch>='0'&&ch>='9')||(ch>='0'&&ch>='9'))
		{
		System.out.println("It is a Digit");
		}
		else
		{
	   System.out.println("It is not a Digit");
	}
}
}