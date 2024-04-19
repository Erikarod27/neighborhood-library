package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    //Array to hold an inventory of books
    private Book[] inventory;

    //Constructor to initialize the inventory
    public NeighborhoodLibrary() {
        //Initialize inventory with 20 books
        inventory = new Book[20];
        //Populate the inventory with books
        for (int i = 0; i < 20; i++) {
            inventory[i] = new Book(i + 1, "0000" + (i + 1), "Book: part " + (i+1));
        }
    }

    //Method to display the home screen
    public void displayHomeScreen() {
        //Display options: show available books, show checked out books, exit
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Neighborhood Library!");
            System.out.println("1. Show available books");
            System.out.println("2. Show checked out books");
            System.out.println("3. Exit");
            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayAvailableBooks();
                    checkOutBook();
                    break;
                case 2:
                    displayCheckedOutBooks();
                    checkInBook();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    //Method to display available books
    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : inventory) {
            if (!book.isCheckedOut()) {
                System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
            }
        }
    }

    //Method to display checked out books
    public void displayCheckedOutBooks() {
        //Iterate through inventory and display books that are checked out
        System.out.println("Checked out Books:");
        for (Book book : inventory) {
            if (book.isCheckedOut()) {
                System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle() + ", Checked Out To: " + book.getCheckedOutTo());
            }

        }
    }

    //Method to check out a book
    public void checkOutBook() {
        //Prompt the user for input (Book ID, name), check out the book, and update inventory
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of the book you want to check out: ");
        int id = scanner.nextInt();
        for (Book book : inventory) {
            if (book.getId() == id) {
                if (!book.isCheckedOut()) {
                    System.out.print("Enter your name: ");
                    String name = scanner.next();
                    if (book.checkedOut(name)) {
                    System.out.println("Book checked out successfully.");
                    } else {
                        System.out.println("Sorry, book already checked out.");
                    }
                } else {
                    System.out.println("Sorry, book already checked out.");
                }
                return;
            }
        }
        System.out.println("Invalid Book ID.");
    }

    //Method to check in a book
    public void checkInBook() {
        //Prompt the user for input (book ID, name), check in the book, an update inventory
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of the book you want to check in: ");
        int id = scanner.nextInt();
        for (Book book : inventory) {
            if (book.getId() == id) {
                if (book.isCheckedOut()) {
                    book.checkedIn();
                    System.out.println("Book check in successfully.");
                } else {
                    System.out.println("Sorry, the book is not checked out.");
                }
                return;
            }
        }
        System.out.println("Invalid Book ID.");
    }
}
