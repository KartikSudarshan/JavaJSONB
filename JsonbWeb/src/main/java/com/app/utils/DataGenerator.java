package com.app.utils;

import com.app.beans.Address;
import com.app.beans.Customer;
import com.app.beans.Order;
import com.app.beans.OrderDetails;
import com.app.beans.Product;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    public static List<Order> getData() {
        List<Order> orders = new ArrayList<>();
        Address address = new Address();
        address.setCity("Los Angeles");
        address.setCountry("USA");
        address.setZipcode(91234);
        address.setStreet("XYZ Avenue");
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "iphone8", 799.99, "Apple", "Good shippers"));
        products.add(new Product(2, "Kitchen Cutlery", 236.873, "Clean Kitchens", "Great shippers"));
        products.add(new Product(3, "Whirlpool Washing machine", 400, "Whirpool", "ABC shipping"));
        products.add(new Product(4, "Nike running shoes", 300, "Nike", null));
        products.add(null);
        OrderDetails orderDetails = new OrderDetails(products, address, 1763.863);
        Customer customer = new Customer(123, "Rachel Green", "test@gmail.com", true);
        Order order = new Order(orderDetails, 199, LocalDate.parse("2018-08-01"), LocalDate.parse("2018-08-10"), customer);
        orders.add(order);

        Address address2 = new Address();
        address2.setCity("Chicago");
        address2.setCountry("USA");
        address2.setZipcode(43458);
        address2.setStreet("ABC Avenue");
        List<Product> products2 = new ArrayList<>();
        products2.add(new Product(1, "iphone", 799.99, "Apple", "Good shippers"));
        products2.add(new Product(2, "Pillows", 200.873, "Sleepy Time", "Ship Safe"));
        products2.add(new Product(3, "Bike", 400, "Racing Wheels", "AAA Shipping"));
        products2.add(new Product(4, "Climbing Shoes", 300, "Rocky", "Shippers R Us"));
        OrderDetails orderDetails2 = new OrderDetails(products2, address2, 1763.863);
        Customer customer2 = new Customer(123, "Andrew Probert", "test1@gmail.com", true);
        Order order2 = new Order(orderDetails2, 200, LocalDate.parse("2018-07-05"), LocalDate.parse("2018-07-10"), customer2);
        orders.add(order2);
        return orders;

    }

}
