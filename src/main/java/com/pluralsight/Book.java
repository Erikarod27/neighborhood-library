package com.pluralsight;

public class Book {
    //Properties
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //Constructor
    public Book(int id, String isbn, String title) {
        //Initialize properties
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut = false;
        this.checkedOutTo = checkedOutTo = "";
    }

    //Methods
    public boolean checkedOut(String name) {
        if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
            return true;
        } else {
            return false;
        }

    }

    public void checkedIn() {
        if (isCheckedOut) {
            isCheckedOut = false;
            checkedOutTo = null;
        }
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    //Getter for id
    public int getId() {
        return id;
    }

    //Setter for id
    public void setId(int id) {
        this.id = id;
    }

    //Getter for isbn
    public String getIsbn(){
        return isbn;
    }

    //Setter for isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //Getter for title
    public String getTitle() {
        return title;
    }

    //Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    //setter for checked out
    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    //set checked out to
    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    //getter for checked out to
    public String getCheckedOutTo() {
        return checkedOutTo;
    }
}
