import java.util.Scanner;
public class Arraysum {
	public static void main(String[]args){
		int n,sum=0;
		float avg=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("enter number of elements:");
		n=reader.nextInt();
		int num[]=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++){
			num[i]=reader.nextInt();
			
		}
		for(int i=0;i<n;i++){
			sum=sum+num[i];
		}
		avg=(float)sum/n;
		System.out.println("sum of elements:"+sum);
		System.out.println("average of elements:"+avg);
	
	}	
	}


