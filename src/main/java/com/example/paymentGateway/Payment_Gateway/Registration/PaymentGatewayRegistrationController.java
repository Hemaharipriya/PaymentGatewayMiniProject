package com.example.paymentGateway.Payment_Gateway.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentGatewayRegistrationController {
	
	@Autowired
	private PaymentGatewayRegistrationService paymentGatewayRegistrationService;
	
	@RequestMapping(method=RequestMethod.POST, value="/register")
	public ResponseEntity<String> addMerchant(@RequestBody PaymentGatewayRegistration paymentGatewayRegistration) {
		var p = paymentGatewayRegistrationService.addMerchant(paymentGatewayRegistration);
//		System.out.println(p);
//		System.out.println(paymentGatewayRegistration.getMerchantId());
		if(p == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Merchant Alreay Existed");
		}
		return ResponseEntity.status(HttpStatus.CREATED).body("Successfully added Merchant Data");
		
	}
}
