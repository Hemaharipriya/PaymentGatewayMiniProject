package com.example.paymentGateway.Payment_Gateway.Registration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Merchants")
public class PaymentGatewayRegistration {

	@Id
	private int merchantId;
	private String merchantName;
	private String email;
	private String businessType;
	private String address;
	private String phone;
	
	public PaymentGatewayRegistration() {
		
	}
	
	public PaymentGatewayRegistration(int merchantId, String merchantName, String email, String businessType,
			String address, String phone) {
		super();
		this.merchantId = merchantId;
		this.merchantName = merchantName;
		this.email = email;
		this.businessType = businessType;
		this.address = address;
		this.phone = phone;
	}
	
	
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
