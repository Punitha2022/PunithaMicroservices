package com.sample.orderservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name="order_details")
@NoArgsConstructor //no arg constructor - default constructor
@AllArgsConstructor  // parameterized constructor
@Data //getters and setters,equals ,hashCode,toString
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int orderid;
private int productid;
private int quantity;
private double amount;
private String orderStatus;
public Order(int orderid, int productid, int quantity, double amount, String orderStatus) {
	super();
	this.orderid = orderid;
	this.productid = productid;
	this.quantity = quantity;
	this.amount = amount;
	this.orderStatus = orderStatus;
}
public Order() {
	super();
}
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getOrderStatus() {
	return orderStatus;
}
public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}


}






