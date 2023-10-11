package com.example.paymentGateway.Payment_Gateway.Payment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Payments")
public class Payment{
	
	@Id
	private int orderId;
	private int merchantId;
	private float amount;
	private String currency;

	
	public Payment() {
		
	}
	
	public Payment(int orderId, float amount, String currency, int merchantId) {
		super();
		this.amount = amount;
		this.currency = currency;
		this.orderId = orderId;
		this.merchantId = merchantId;
	}
	
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	@Override
	public String toString() {
		return "Payment [orderId=" + orderId + ", merchantId=" + merchantId + ", amount=" + amount + ", currency="
				+ currency + "]";
	}
	
}
