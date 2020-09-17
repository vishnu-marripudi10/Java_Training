package oops;

import oops.CardApp;

public class MembershipCard extends CardApp {

	private int rating;

	public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MembershipCard \n Rating=" + getRating() + "\n" + " HolderName=" + getHolderName() + "\n"
				+ " CardNumber=" + getCardNumber() + "\n" + " ExpiryDate=" + getExpiryDate() + "";
	}

}
