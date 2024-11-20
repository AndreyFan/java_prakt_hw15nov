package de.telran.practice_15_11.hw_Bibliotek;

public class Book {

        private int id;
        private String title;
        private String author;
        private User user;

    public Book(int id, String title, String author, User user) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public User getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
