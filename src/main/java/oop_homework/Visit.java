package oop_homework;

import lombok.ToString;

@ToString
public class Visit {
    public Customer customer;
    public DiscountRate discountRate;
    public double serviceExpenses;
    public double productExpenses;

    public Visit(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public DiscountRate getDiscountRate() {
        return discountRate;
    }

    public double getServiceExpenses() {
        return serviceExpenses;
    }

    public double getProductExpenses() {
        return productExpenses;
    }

    public void setServiceExpenses(double serviceExpenses) {
        this.serviceExpenses = serviceExpenses;
    }

    public void setProductExpenses(double productExpenses) {
        this.productExpenses = productExpenses;
    }

    public double getTotalExpenses() {
        return (serviceExpenses - (serviceExpenses * DiscountRate.getServiceDiscount(customer.getMemberType())) + (productExpenses - (productExpenses * DiscountRate.getProductDiscount(customer.getMemberType()))));
    }

}
