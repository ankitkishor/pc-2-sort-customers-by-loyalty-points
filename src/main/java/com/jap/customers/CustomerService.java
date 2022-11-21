package com.jap.customers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {
    // This method returns the customer's loyalty points in sorted order
    public List<Integer> getListOfCustomersSortedByLoyaltyPoints(List<Customer> customerList, LoyaltyPointComparator loyaltyPointComparator) {

        List<Integer> list = new ArrayList<>();
        Collections.sort(customerList, new LoyaltyPointComparator());

        for (Customer customer : customerList) {

            list.add(customer.getLoyaltyPoints());
        }
        return list;
    }
}
