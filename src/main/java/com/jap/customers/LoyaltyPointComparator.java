package com.jap.customers;


import java.util.Comparator;

// Implement the Comparator interface
public class LoyaltyPointComparator implements Comparator<Customer> {
    public int compare(Customer o1, Customer o2) {
        return Double.compare(o2.getLoyaltyPoints(), o1.getLoyaltyPoints());
    }


}
