import java.util.Scanner;
class AsciiFactor500orNot 
{
	public static void main(String[] args) 
	{
		char a = (char)51;
		System.out.println(a);
		Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the character");
	 char ch = sc.next().charAt(0);
	 int ascii = ch;
	if(ascii%500==0&&ascii%500!=0)
		{
		System.out.println("Given Ascii Factor 500 is equal");
		 
	}
	else
	{
		System.out.println("Given Ascii Factor 500 is not equal");
	} 
   }

}

