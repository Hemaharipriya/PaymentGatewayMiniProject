package com.example.paymentGateway.Payment_Gateway.Registration;

import java.util.Optional;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayRegistrationService {
	
	@Autowired
	private PaymentGatewayRegistrationRepository merchantRegistrationRepository;
	
//	private List<MerchantRegistration> merchantRegistrationList = new ArrayList<>();
	
	public PaymentGatewayRegistration addMerchant(PaymentGatewayRegistration merchantRegistration) {
//		System.out.println(merchantRegistrationRepository.findById(merchantRegistration.));
		Optional<PaymentGatewayRegistration> alreadyExisted = merchantRegistrationRepository.findById(merchantRegistration.getMerchantId());
//		System.out.println(alreadyExisted);
//		System.out.println(alreadyExisted.isEmpty());
		if(alreadyExisted.isEmpty()) {
			return merchantRegistrationRepository.save(merchantRegistration);
		}
		return null;
	}
}
