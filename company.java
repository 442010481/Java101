package Comapny_;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Customer> customerList = new ArrayList();
    List<Order> orderList = new ArrayList();

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    //Method to add customer to customer list
    public void addCustomer(Customer customer) {
        this.customerList.add(customer);
    }

    //Method to print customer detail
    public void printCustomerList(List<Customer> customerList) {
        customerList.forEach((customer) -> {
            System.out.println(customer.toString());
        });
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
