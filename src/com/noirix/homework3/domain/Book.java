package com.noirix.homework3.domain;

public class Book implements Comparable<Book>{

    private String title;
    private String lastNameAuthors;
    private String authorsName;
    private String patronymicAuthorsName;
    private int yearOfPublication;
    private String randomString;

    public Book() {
    }

    public Book(String title, String lastNameAuthorsName, String authorsName, String patronymicAuthorsName, int yearOfPublication, String randomString) {
        this.title = title;
        this.lastNameAuthors = lastNameAuthorsName;
        this.authorsName = authorsName;
        this.patronymicAuthorsName = patronymicAuthorsName;
        this.yearOfPublication = yearOfPublication;
        this.randomString = randomString;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLastNameAuthorsName() {
        return lastNameAuthors;
    }

    public void setLastNameAuthorsName(String lastNameAuthorsName) {
        this.lastNameAuthors = lastNameAuthorsName;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public String getPatronymicAuthorsName() {
        return patronymicAuthorsName;
    }

    public void setPatronymicAuthorsName(String patronymicAuthorsName) {
        this.patronymicAuthorsName = patronymicAuthorsName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getRandomString() {
        return randomString;
    }

    public void setRandomString(String randomString) {
        this.randomString = randomString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (yearOfPublication != book.yearOfPublication) return false;
        if (!title.equals(book.title)) return false;
        if (!lastNameAuthors.equals(book.lastNameAuthors)) return false;
        if (!authorsName.equals(book.authorsName)) return false;
        if (!patronymicAuthorsName.equals(book.patronymicAuthorsName)) return false;
        return randomString.equals(book.randomString);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + lastNameAuthors.hashCode();
        result = 31 * result + authorsName.hashCode();
        result = 31 * result + patronymicAuthorsName.hashCode();
        result = 31 * result + yearOfPublication;
        result = 31 * result + randomString.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", lastNameAuthorsName='" + lastNameAuthors + '\'' +
                ", authorsName='" + authorsName + '\'' +
                ", patronymicAuthorsName='" + patronymicAuthorsName + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", randomString='" + randomString + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.getYearOfPublication() - o.getYearOfPublication();
    }
}
