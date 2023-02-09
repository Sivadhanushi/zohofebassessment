package zohoassessmentfeb;

public class RotateMatrix_6 {

	public static void main(String[] args) {
		int num=0;
		int[][] a = new int[num][num];
		int rowstart = 0, rowend = a.length;
		int colstart = 0, colend = a[0].length ;

		//int a = 1;
		while (rowstart < rowend && colstart < colend) {

			for (int i = colstart; i < colend; i++) {
				System.out.println(a[rowstart][i] +" ");
			}
			rowstart+=1;
			for (int i = rowstart; i <= rowend; i++) {
				System.out.println(a[i][colend-1]+ " " );
			}
			colend-=1;
			for (int i = colend; i >= colstart; i--) {
				System.out.println(a[rowend][i]) ;
			}
			rowend-=1;
			for (int i = rowend-1; i >= rowstart; i--) {
				System.out.println(a[i][colstart]);
			}
			colstart += 1;
			//rowstart++;
			//colend--;
			//rowend--;
		}

		/*for (int arr[] : array) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}*/
	}

		 }
	 	 
		 


	


