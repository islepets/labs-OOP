package lab6_OOP;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UpdateArray {
	
	public static int n1;
	public static int m1;
	
public static int[][] array() {
		File file = new File("D:\\Java\\lab6_OOP\\bin\\lab6_OOP\\input.txt");
		try{
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextInt()) {
				int n1=scanner.nextInt();
				int m1=scanner.nextInt();
				
				UpdateArray.n1=n1;
				UpdateArray.m1=m1;
				
				int mass[][];
				mass = new int[n1][m1];
				for(int i=0;i<n1;i++) {
					for(int j=0;j<m1;j++) {
						mass[i][j]=scanner.nextInt();
						
					}
				}
				return mass;
			}
			scanner.close();
		}catch(IOException x) {
			System.err.format("IOException: ошибка");
		}
		return null;
	}

public static int[][] isRow(int array[][],int n, int m){
	    int rowSum[] = new int[n];
	 	for(int i = 0; i < n; i++){
	 	    for(int j = 0; j < m; j++){
	 	        rowSum[i]+=array[i][j];
	 	    }
	 	}
	 	int mxSum = 0;
	 	int mnSum = 0;
	 	for(int i = 0; i < n; i++){
	 	   if(rowSum[i] > rowSum[mxSum])
	 	        mxSum = i;
	 	   if(rowSum[i] < rowSum[mnSum])
	 	        mnSum = i;
	 	}
	 	int temp[] = array[mxSum];
	 	array[mxSum] = array[mnSum];
	 	array[mnSum] = temp;
	 	return array;
	}
public static int[][] isColmn(int array[][],  int n, int m){
			 int[] colSum = new int[m];
		     for (int i = 0;i<n; i++) {
		         for (int j = 0; j < m; j++) {
		             colSum[j] += array[i][j];
		         }
		     }
		
		     int mxSum = 0;
		     for (int j = 0; j < m; j++) {
		         if (colSum[j] > colSum[mxSum]) {
		             mxSum = j;
		         }
		     }
		
		     int[][] newArray = new int[n][m + 1];
		     for (int i = 0; i < n; i++) {
		         for (int j = 0; j < m; j++) {
		             newArray[i][j] = array[i][j];
		         }
		         newArray[i][m] = array[i][mxSum];
		     }
		
		 int extraColumn = mxSum + 1;
		
		 for (int i = 0; i < n; i++) {
		     for (int j = m; j > extraColumn; j--) {
		         newArray[i][j] = newArray[i][j - 1];
		     }
		     newArray[i][extraColumn] = array[i][mxSum];
		 }
		 return newArray;
	
	}
	
}
