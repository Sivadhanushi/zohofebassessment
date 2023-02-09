package zohoassessmentfeb;

import java.util.Arrays;

public class Insertionsort_que8 {

	public static void main(String[] args) {
		      int [] arr = {5,8,2,4,3,9};
		 for(int i=1;i<arr.length;i++) {
		     for(int j=i;j>0;j--) {
		          if(arr[j]<arr[j-1]) {
		           int temp = arr[j];
		           arr[j]= arr[j-1] ;
		           arr[j-1]= temp;	
		            		}	
		            	}
		            }
		            System.out.println(Arrays.toString(arr));
			}

	}


