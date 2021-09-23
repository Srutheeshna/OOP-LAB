import java.util.Scanner;
public class Largestof3Num {
public static void main(String[]args){
	Scanner reader=new Scanner(System.in);
	System.out.println("enter first number:");
	int num1=reader.nextInt();
	System.out.println("enter second number:");
	int num2=reader.nextInt();
	System.out.println("enter third number:");
	int num3=reader.nextInt();
	if(num1>num2&&num1>num3)
		System.out.println("num1 is largest");
	else if(num2>num1&&num2>num3)
		System.out.println("num2 is largest");
	else
		System.out.println("num3 is largest");


	
}
}