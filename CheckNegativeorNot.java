import java.util.Scanner;
class  CheckNegativeorNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
	if(num<0)
		{
		System.out.println("It is Negative");
		}
		else
		{
	   System.out.println("It is Positive");
	}
}
}