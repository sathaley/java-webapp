package com.shantanu.dbmodel;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by shantanu on 22/6/17.
 */
@Entity
public class Orders extends BaseModel {

    @Column(nullable = false)
    private Integer quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Orders orders = (Orders) o;

        return quantity != null ? quantity.equals(orders.quantity) : orders.quantity == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }

    public Integer getQuantity() {

        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
