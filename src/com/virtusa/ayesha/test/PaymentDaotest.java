package com.virtusa.ayesha.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.virtusa.ayesha.doa.PaymentDoa;
import com.virtusa.ayesha.model.CreditCardDetails;

public class PaymentDaotest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 PaymentDaotest dao = new PaymentDaotest();
		System.out.println("@before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		PaymentDaotest dao=null;
		System.out.println("@after class");

	}

	/*@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPaymentDoa() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testdoPayment() {
		
			CreditCardDetails creditCardDetails=new CreditCardDetails(666,"credit card","ayesha","2/2024",222);
			int flag=0;
			flag=CreditCardDetails.doPayment(creditCardDetails);
			assertEquals(0,flag);

		//fail("Not yet implemented");
	}

}
