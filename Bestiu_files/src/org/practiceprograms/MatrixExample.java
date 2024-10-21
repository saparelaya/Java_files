package org.practiceprograms;
import java.util.Scanner;

public class MatrixExample {

	public static void main(String[] args) {
		 int[][] matrix = new int[3][3];
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the elements of the 3x3 matrix:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Element at [" + i + "][" + j + "]: ");
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	        scanner.close();
	        System.out.println("The 3x3 matrix is:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
