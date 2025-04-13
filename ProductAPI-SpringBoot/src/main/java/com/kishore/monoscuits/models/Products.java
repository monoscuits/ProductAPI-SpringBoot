package com.kishore.monoscuits.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Products() {
        super();
    }

    public Products(int stock, String description, String category, int numberOfRatings, double ratings, double price, String name, List<String> image) {
        this.stock = stock;
        this.description = description;
        this.category = category;
        this.numberOfRatings = numberOfRatings;
        this.ratings = ratings;
        this.price = price;
        this.name = name;
        this.image = image;
    }



    private String name;
    private double price;
    private double ratings;
    private int numberOfRatings;
    private String category;
    private String description;
    private int stock;

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }

    @ElementCollection
    @Column(name="image_url")
    private List<String> image;
}
