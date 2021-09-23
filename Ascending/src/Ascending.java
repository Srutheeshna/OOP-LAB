import java.util.Scanner;
public class Ascending {
	public static void main(String[]args){
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n,temp;
		n=reader.nextInt();
		int num[]=new int[n];
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++)
		{
			num[i]=reader.nextInt();
		}
		for(int i=0;i<n;i++)
		{
	     for(int j=i+1;j<n;j++)
	     {
	    	 if(num[i]>num[j]){
	    		 temp=num[i];
	    		 num[i]=num[j];
	    		 num[j]=temp;
	    	 }
	     }
		}
		System.out.println("Ascendding order:");
		for(int i=0;i<n;i++)
		{
			System.out.println(num[i]+" ");
		}
	}

}
