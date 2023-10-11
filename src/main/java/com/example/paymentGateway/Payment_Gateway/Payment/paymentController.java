package com.example.paymentGateway.Payment_Gateway.Payment;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class paymentController {

	@Autowired
	private paymentService paymentService;
	private Logger log = LoggerFactory.getLogger(paymentController.class);
	
	@RequestMapping(method=RequestMethod.POST, value="/payment")
	public ResponseEntity<String> addPaymentDetails(@RequestBody Payment payment) {
		log.info("req : {}", payment);
		if(payment == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please send amount in USD");
		}
		var p = paymentService.addPaymentDetails(payment);
//		System.out.println(p);
		if(p == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please send amount in USD");
		}
	
		return ResponseEntity.status(HttpStatus.CREATED).body("Added successfully");
		
	}
	
	@RequestMapping("/getRequest")
	public List<Payment> getAllData() {
		return paymentService.getAllData();
	}
	
	@RequestMapping("/paymentStatus/{orderId}")
	public ResponseEntity<String> getPaymentStatus(@PathVariable int orderId) {
		var res = paymentService.getPaymentStatus(orderId);
		System.out.println(res);
		if(res == "Failed") {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Payment Failed");
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body("Payment Success");
		}
		
	}
	
}
