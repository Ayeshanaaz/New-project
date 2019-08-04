package com.virtusa.ayesha.util;

        import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;

import com.virtusa.ayesha.exception.PaymentException;

		public class ConnectionUtil {
		public static  Connection getConnection() throws PaymentException{

		try {
		Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		
		throw new PaymentException("Driver is not available ");	
		}
		       Connection connection=null;
		try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost/payments", "root", "root");
		} catch (SQLException e) {


		throw new PaymentException("Connection is not avaialble ");
		}	
		return connection;

		}

		




	}