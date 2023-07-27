package org.example.Bibliothèque;

public class Livre {

    private String title;
    private String author;
    private  int numberOfPages;
    private boolean isBorrowed = false;

    public Livre(String title, String author, int numberOfPages, boolean isBorrowed){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.isBorrowed = isBorrowed;



    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    public void displayBookInfo() {
        System.out.println(toString());

    }

    public void changeBookStatus(){
        if (isBorrowed == false){
            isBorrowed = true;
        }
    }

    public void borrowBook(){
        changeBookStatus();
    }

    public void returnBook(){
        isBorrowed = false;
    }
}
