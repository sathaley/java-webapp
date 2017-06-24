package com.shantanu.dao;

import com.shantanu.dbmodel.Customer;

/**
 * Created by shantanu on 24/6/17.
 */
interface CustomerDAO {
    public Customer getCustomer(long id);
    public Customer saveCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public void deleteCustomer (Customer customer);
}
