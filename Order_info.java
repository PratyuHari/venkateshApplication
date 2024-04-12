package com.cg.trg.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order_info {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long orderI;
	private String orderName;
	private String email;
	private boolean orderStatus;
	private int quantity;
	private String dateCreated;
	public Order_info() {
		super();
	}
	public Order_info(long orderId, String orderName, String email, boolean orderStatus, int quantity,
			String dateCreated) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.email = email;
		this.orderStatus = orderStatus;
		this.quantity = quantity;
		this.dateCreated = dateCreated;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	


}
