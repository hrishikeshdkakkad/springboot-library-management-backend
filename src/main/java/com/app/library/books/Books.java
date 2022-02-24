package com.app.library.books;

import javax.persistence.*;

@Entity
@Table
public class Books {
    @Id
    @SequenceGenerator(
            name = "books_sequence",
            sequenceName = "books_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "books_sequence"
    )
    private Long id;
    private String name;
    private String authorName;
    private String bookDescription;
    /**
     * Total Number of a particular book available in the Library
     */
    private double totalBookAvailibilityCount;

    public Books() {
    }

    public Books(Long id, String name, String authorName, String bookDescription, double totalBookAvailibilityCount) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.bookDescription = bookDescription;
        this.totalBookAvailibilityCount = totalBookAvailibilityCount;
    }

    public Books(String name, String authorName, String bookDescription, double totalBookAvailibilityCount) {
        this.name = name;
        this.authorName = authorName;
        this.bookDescription = bookDescription;
        this.totalBookAvailibilityCount = totalBookAvailibilityCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public double getTotalBookAvailibilityCount() {
        return totalBookAvailibilityCount;
    }

    public void setTotalBookAvailibilityCount(double totalBookAvailibilityCount) {
        this.totalBookAvailibilityCount = totalBookAvailibilityCount;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", totalBookAvailibilityCount=" + totalBookAvailibilityCount +
                '}';
    }
}
