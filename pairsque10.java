package zohoassessmentfeb;

import java.util.Arrays;
import java.util.Scanner;

public class pairsque10 {

	public static void main(String[] args) {
	         int cnt=0;
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter N :");
	        int n = in.nextInt();
	        System.out.println("Enter K :");
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int i=0; i < n; i++){
	            a[i] = in.nextInt();
	        }
	        for(int i=0; i < n-1; i++){
	          for(int j=i+1; j< n; j++){
	           if( (a[i]+a[j])%k==0)
	               cnt++;
	               
	        } 
	        }
            int i=0;
			int j=0;
			//System.out.println("Pairs: " + Arrays.toString(a));
	        System.out.println(cnt);
	    }
	
	}


