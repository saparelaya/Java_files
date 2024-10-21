package org.practiceprograms;

public class Car {
	String model;
    double price;

    public Car()
    {
        model = "Toyota";  
        price = 25000.00;          
    }
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: $" + price);
    }

	public static void main(String[] args) {
		Car myCar = new Car();
        myCar.displayDetails();

	}

}
