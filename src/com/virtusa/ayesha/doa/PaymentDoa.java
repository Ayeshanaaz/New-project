package com.virtusa.ayesha.doa;
import java.sql.*;

import com.virtusa.ayesha.exception.PaymentException;
import com.virtusa.ayesha.model.CreditCardDetails;
import com.virtusa.ayesha.util.ConnectionUtil;


public class PaymentDoa {

	public PaymentDoa() {

	}
	public int doPayment(CreditCardDetails details) {
		int flag=0;
		ResultSet resultSet=null;
		PreparedStatement preparedStatment=null;
		try{
			Connection connection=ConnectionUtil.getConnection();
			preparedStatment=connection.prepareStatement("insert into carddetails(cardNumber,cardType,cardHolderName,cardExpiryDate,cardCVV) values(?,?,?,?,?)");
			preparedStatment.setLong(1,details.getCardNumber());
			preparedStatment.setString(3,details.getCardType());

			preparedStatment.setString(2,details.getCardName());

			preparedStatment.setString(4, details.getExpiryDate());
			preparedStatment.setLong(5,details.getCVV());
			flag=preparedStatment.executeUpdate();
			}
		catch (SQLException e) {


			try {
				throw new PaymentException(e.getMessage());
			} catch (PaymentException e1) {

				e1.printStackTrace();
			}
			} catch (Exception e) {


			try {
				throw new PaymentException(e.getMessage());
			} catch (PaymentException e1) {

				e1.printStackTrace();
			}
			}
		return flag;
		}

	}
