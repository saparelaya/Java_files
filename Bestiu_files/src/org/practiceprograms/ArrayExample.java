package org.practiceprograms;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("The entered integers are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }


}

		        
		      