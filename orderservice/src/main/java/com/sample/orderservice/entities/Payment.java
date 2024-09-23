package com.sample.orderservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
private int paymentid;
private int orderid;
private double amount;
private String paymentStatus;
public Payment(int orderid,double amount) {
	this.orderid=orderid;
	this.amount=amount;
}
public Payment(int paymentid, int orderid, double amount, String paymentStatus) {
	super();
	this.paymentid = paymentid;
	this.orderid = orderid;
	this.amount = amount;
	this.paymentStatus = paymentStatus;
}
public Payment() {
	super();
	// TODO Auto-generated constructor stub
}
public int getPaymentid() {
	return paymentid;
}
public void setPaymentid(int paymentid) {
	this.paymentid = paymentid;
}
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getPaymentStatus() {
	return paymentStatus;
}
public void setPaymentStatus(String paymentStatus) {
	this.paymentStatus = paymentStatus;
}

}
