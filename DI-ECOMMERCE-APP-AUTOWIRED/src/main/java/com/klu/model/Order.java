package com.klu.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Order {
private int orderId;
private String customerName;
private int quantity;
@Autowired
private Product product;
public Order()
{
	this.orderId=2006;
	this.customerName="Anjali";
	this.quantity=4;
}
public void display()
{
System.out.println("the following are the order details");
System.out.println("orderid: "+orderId);
System.out.println("CustomerName: "+customerName);
System.out.println("Quantity: "+quantity);
System.out.println("ProductId: "+product.getProductId());
System.out.println("ProductName: "+product.getproductName());
System.out.println("ProductPrice: "+product.getPrice());
System.out.println("ProductCategory: "+product.getCategory());
}
}
