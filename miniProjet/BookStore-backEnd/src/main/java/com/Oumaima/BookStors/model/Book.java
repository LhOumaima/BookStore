package com.Oumaima.BookStors.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=1,max=100)
    private String title;
    @NotNull
    @Size(min = 1, max = 100)
    private String author;
    @NotNull
    @Positive
    private Double price;
    @Size(max = 500)
    private String description;
    // Constructeurs
    public Book() {
    }
    public Book(String title, String author, Double price, String description) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.description = description;
    }
    //Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
