package org.practiceprograms;

public class Book {
	String title;
    String author;
    public Book(String title, String author)
    {
       this.title = title;
       this.author = author;
    }
    public void displayDetails()
    {
       System.out.println("Book Title: " + title);
       System.out.println("Author: " + author);
    }

	public static void main(String[] args) {
		Book myBook = new Book("Panchatantra", "Vishnu Sharma");
        myBook.displayDetails();

	}
}
