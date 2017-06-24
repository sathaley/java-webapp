package com.shantanu.dbmodel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.Date;

/**
 * Created by shantanu on 22/6/17.
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("appEntityManager");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Customer customer = new Customer();
        customer.setFirstName("Jon");
        customer.setLastName("Snow");
        customer.setCreatedDate(new Date());
        customer.setOrdersSet(Collections.EMPTY_SET);
        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();

    }
}
