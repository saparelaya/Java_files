package org.practiceprograms;

public class MethodOverLoading {
	public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

	public static void main(String[] args) {
		int intProduct = multiply(43, 10);
        System.out.println("Product of two integers (43 and 10): " + intProduct);

        double doubleProduct = multiply(3.5, 9.5);
        System.out.println("Product of two doubles (3.5 and 9.5): " + doubleProduct);

	}

}
