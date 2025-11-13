import java.util.*;
public class TASK1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		while(true)
		{
		System.out.println("Choose Operation To Perform");
		
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		System.out.println("Enter 5 for Exit");
		System.out.print("Enter your Choice:");
		int n=sc.nextInt();
		if(n==5)
		{
			System.out.println("Exit");
			break;
		}
		System.out.println("Enetr Values To Perform Operations On");
		System.out.print("Value1:");
		int num1=sc.nextInt();
		System.out.print("Value2:");
		int num2=sc.nextInt();
			switch(n)
			{
				case 1:
				{
					addition(num1,num2);
					break;
				}
				case 2:
				{
					subtraction(num1,num2);
					break;
				}
				case 3:
				{
					multiplication(num1,num2);
					break;
				}
				case 4:
				{
					if(num2!=0)
					{
						division(num1,num2);
					}
					else
					{
						System.out.println(num1+" is not Divided By "+num2);
					}
					break;
				}
				default:
				{
					System.out.println("Invalid Operation");
				}
			}
		}
	}
	public static void addition(int a,int b)
	{
		System.out.println("Addtion of Two Integers is:"+(a+b));
	}
	public static void subtraction(int a,int b)
	{
		System.out.println("Subtraction of Two Integers is:"+(a-b));
	}
	public static void multiplication(int a,int b)
	{
		System.out.println("Multiplication of Two Integers is:"+(a*b));
	}
	public static void division(int a,int b)
	{
		System.out.println("Division of Two Integers is:"+(a/b));
	}
}

