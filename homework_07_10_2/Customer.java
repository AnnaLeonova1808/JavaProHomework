package javaPro.homework_07_10_2;

import java.util.*;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private List<String> customerPurchases;
    private Map<String,Integer> customerCart;

    public Customer(int customerId, String customerName, String customerEmail, String customerPhone/*, List<String> customerPurchases, Map<String, Integer> customerCart*/) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerPurchases = new ArrayList<>();
        this.customerCart = new HashMap<>();
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public List<String> getCustomerPurchases() {
        return customerPurchases;
    }

    public void setCustomerPurchases(List<String> customerPurchases) {
        this.customerPurchases = customerPurchases;
    }

    public Map<String, Integer> getCustomerCart() {
        return customerCart;
    }

    public void setCustomerCart(Map<String,Integer>customerCart) {
        this.customerCart = customerCart;
    }

    @Override
    public String toString() {
        return "Customer_2{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone=" + customerPhone +
                ", customerPurchases=" + customerPurchases +
                ", customerCart=" + customerCart +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer2)) return false;
        return customerId == customer2.customerId && customerPhone == customer2.customerPhone && Objects.equals(customerName, customer2.customerName) && Objects.equals(customerEmail, customer2.customerEmail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, customerEmail, customerPhone);
    }


}
