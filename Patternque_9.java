package zohoassessmentfeb;

import java.util.Scanner;

public class Patternque_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N :");
		int n = sc.nextInt();
             for(int i=0;i<n;i++) 
             {
            	 for(int j=0;j<n;j++)
            	 {
            		 if(i==0 || j==0 || i==n-1 || j==n-1)
            		 {
            			 System.out.print("1");
            		 }
            		 else if (i==i+2 || j==j+2)
            			 System.out.print("1");
            		 else
            			 System.out.print("0");

            		 
            	 }
            	 System.out.println();
             }
            
	}

}
