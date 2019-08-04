package com.virtusa.ayesha.model;

public class CreditCardDetails {

	public long cardNumber;
	public String cardType;
	public String cardName;
	public String ExpiryDate;
	public String TotalAmount;
	public long CVV;
	public CreditCardDetails() {
	}
	

	
	public CreditCardDetails(long cardNumber, String cardType, String cardName, String expiryDate, long cVV) {
		super();
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.cardName = cardName;
		ExpiryDate = expiryDate;
		CVV = cVV;
	}



	/**
	 * @return the expiryDate
	 */
	public String getExpiryDate() {
		return ExpiryDate;
	}
	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}
	
	
	
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public long getCVV() {
		return CVV;
	}
	public void setCVV(long cVV) {
		CVV = cVV;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CreditCardDetails [cardNumber=" + cardNumber + ", cardName=" + cardName + ", cardType=" + cardType
				+ ", ExpiryDate=" + ExpiryDate + ", CVV=" + CVV + "]";
	}



	public static int doPayment(CreditCardDetails creditCardDetails) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
