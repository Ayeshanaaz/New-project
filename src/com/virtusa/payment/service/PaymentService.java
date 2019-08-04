package com.virtusa.payment.service;

import com.virtusa.ayesha.doa.PaymentDoa;
import com.virtusa.ayesha.exception.PaymentException;
import com.virtusa.ayesha.model.CreditCardDetails;

public class PaymentService {

	public PaymentService() {

	}
 PaymentDoa doa=new PaymentDoa();
	public int doPayment(CreditCardDetails details)throws PaymentException {
			return doa.doPayment(details);
	}

}
