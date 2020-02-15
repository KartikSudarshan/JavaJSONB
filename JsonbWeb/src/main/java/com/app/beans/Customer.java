package com.app.beans;

import javax.json.bind.annotation.JsonbProperty;


public class Customer {

    private int customerId;

    private String customerName;
    private String emailAddress;
    private boolean isPrimeUser;

    public Customer(int customerId, String customerName, String emailAddress, boolean isPrimeUser) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.isPrimeUser = isPrimeUser;
    }

    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {//it will prefer this key on serializtion
        return customerName;
    }

    public void setCustomerName(String customerName) {//it will prefer this key on deserializtion
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isIsPrimeUser() {
        return isPrimeUser;
    }

    public void setIsPrimeUser(boolean isPrimeUser) {
        this.isPrimeUser = isPrimeUser;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerName=" + customerName + ", emailAddress=" + emailAddress + ", isPrimeUser=" + isPrimeUser + '}';
    }

}
