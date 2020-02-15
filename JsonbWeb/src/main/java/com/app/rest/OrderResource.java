package com.app.rest;

import java.util.ArrayList;
import java.util.List;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.app.beans.Order;
import com.app.utils.DataGenerator;

@Path("orders")
public class OrderResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Order> getOrders() {
		List <Order> orders=getOrdersFromDB();
		return orders;
	}
	
	public List<Order> getOrdersFromDB(){
		
		List <Order> orders=new ArrayList<>();
		orders=DataGenerator.getData();
		return orders;
	}
	
	@POST
	@Path("edit")
	public String editOrder(Order order) {
		System.out.println(order.getOrderId());
		//edit the order
		return "Order Updated";
	}
	
	@GET
	@Path("getorder")
	@Produces(MediaType.APPLICATION_JSON)
	public Order findOrder(@QueryParam("id") int orderId) {
		List <Order> orders=getOrdersFromDB();
		for (Order order:orders) {
			if (order.getOrderId()==orderId) {
				return order;
			}
			
		}
		return null;
		
		
	}
	
	
	
}
