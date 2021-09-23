import java.util.Scanner;
public class MatAddition {
public static void main(String[]args){
	int row,col;
	Scanner reader=new Scanner(System.in);
	System.out.println("enter the elements off first matrix:");
    for(int i=0;i<row;i++){
    	for(int j=0;j<col;j++){
	a[i][j]=reader.nextInt();
		}
	}
		int b[][]=new int[row][col];
		System.out.println("enter the elements off second matrix:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
	    		b[i][j]=reader.nextInt();
	    		}
				}
			}
int row,col;
       int c[][]=new int[row][col];
       System.out.println("first matrix:");
       for(int i=0;i<row;i++){
    	   for(int j=0;j<col;j++){
    		   System.out.println(a[i][j]+" ");
    	   }
    	   System.out.println(" ");
       }
      
    	   System.out.println("Second matrix:");
       
    	   for(int i=0;i<row;i++){
        	   for(int j=0;j<col;j++){
        		   System.out.println(b[i][j]+" ");
        	   }
        	   System.out.println(" ");
           }

    	   for(int i=0;i<row;i++){
        	   for(int j=0;j<col;j++){
c[i][j]=a[i][j]+b[i][j];
}
}
    	   System.out.printl("matrix after addition:");{
    		   for(int i=0;i<row;i++){
            	   for(int j=0;j<col;j++){
            		   System.out.println(c[i][j]+" ");
            	   }
            	   System.out.println(" ");
               }
    		   

    	   }
    		   
    	   