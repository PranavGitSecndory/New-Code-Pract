package Practice;

import java.util.ArrayList;
import java.util.Scanner;
public class test_11 {
	
	 public void checkEquality(int[][] matrix1, int[][] matrix2, int rows, int cols) {
	        boolean isEqual = true;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (matrix1[i][j] != matrix2[i][j]) {
	                    isEqual = false;
	                    break;
	                }
	            }
	            if (!isEqual) break;
	        }

	        if (isEqual)
	            System.out.println("Matrices are equal.");
	        else
	            System.out.println("Matrices are not equal.");
	    }
	  
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

	 

     System.out.print("Enter number of rows: ");
     int rows = sc.nextInt();
     System.out.print("Enter number of columns: ");
     int cols = sc.nextInt();

     int[][] matrix1 = new int[rows][cols];
     int[][] matrix2 = new int[rows][cols];

     System.out.println("Enter elements of first matrix:");
     for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
             matrix1[i][j] = sc.nextInt();
         }
     }

     System.out.println("Enter elements of second matrix:");
     for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
             matrix2[i][j] = sc.nextInt();
         }
     }

     test_11 obj = new test_11();
     obj.checkEquality(matrix1, matrix2, rows, cols);


}}
