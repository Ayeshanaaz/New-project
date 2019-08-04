package com.virtusa.ayesha.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

import com.virtusa.ayesha.doa.*;

import com.virtusa.ayesha.model.*;
import com.virtusa.ayesha.util.ConnectionUtil;
import com.virtusa.payment.service.PaymentService;

/**
 * Servlet implementation class PaymentController
 */
@WebServlet("/PaymentController")
public class PaymentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentController() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
			}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String card_no=request.getParameter("cardNumber");
		long ca_no=Long.parseLong(card_no);
		String card_name=request.getParameter("cardHolderName");
		String card_type=request.getParameter("cardType");
		String card_exp=request.getParameter("cardExpirydate");
		String card_cv=request.getParameter("cardCVV");
		Long cvv=Long.parseLong(card_cv);
		System.out.println(card_no);
		System.out.println(card_name);
		System.out.println(card_type);
		System.out.println(card_cv);
		System.out.println(card_exp);
		CreditCardDetails details=new CreditCardDetails(ca_no,card_name,card_type,card_exp,cvv);
		PaymentService service=new PaymentService();
		try {
			int status=service.doPayment(details);
			if(status>0){
				out.println("payment is sucess");
		}
		else{
			out.println("not sucess");
		}
		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}

