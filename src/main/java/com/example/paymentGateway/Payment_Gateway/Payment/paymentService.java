package com.example.paymentGateway.Payment_Gateway.Payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class paymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public Payment addPaymentDetails(Payment payment) {
		if(payment.getCurrency().matches("USD")) {
			return paymentRepository.save(payment);
		}
		return null;
	}
	
	public List<Payment> getAllData(){
		return paymentRepository.findAll();
	}
	
	public String getPaymentStatus(int orderId){
//		String str = Integer.toString(orderId);
		if(paymentRepository.findById(orderId).isEmpty()) {
//		if(paymentRepository.findById(orderId).isEmpty()) {
//			System.out.println(paymentRepository);
			return "Failed";
		}
		else {
			return "Success";
		}
		
	}
	
}
