package com.virtusa.payment.service;

import com.virtusa.ayesha.exception.PaymentException;
import com.virtusa.ayesha.model.CreditCardDetails;


public interface IPayment {
 public int doPayment(CreditCardDetails details) throws PaymentException;
}
