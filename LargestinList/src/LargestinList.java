import java.util.Scanner;
public class LargestinList {
	public static void main(String[]args){
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=reader.nextInt();
		int num[]=new int[n];
        System.out.println("array elements:");
        for(int i=0;i<n;i++)
        {
        	num[i]=reader.nextInt();
        }
        int max=num[0];
        for(int i=0;i<n;i++)
        {
        	if(max<num[i])
        	{
        		max=num[i];
        	}
        }
        System.out.println("the largest value in array is"+max);
}
}