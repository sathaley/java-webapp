package com.shantanu.dbmodel;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

/**
 * Created by shantanu on 22/6/17.
 */
@Entity
public class Product extends BaseModel {
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private String category; //TODO: Create a new Entity ProductCategory
    @Column(nullable = true)
    private String description;


    public Product(){

    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!id.equals(product.id)) return false;
        if (!productName.equals(product.productName)) return false;
        if (!category.equals(product.category)) return false;
        return description != null ? description.equals(product.description) : product.description == null;
    }

    @Override
    public int hashCode() {
        int result = productName.hashCode();
        result = 31 * result + category.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
