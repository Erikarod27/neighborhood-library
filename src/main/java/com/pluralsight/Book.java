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

    //Getter and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }
}
