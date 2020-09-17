package oops;

import oops.CardApp;
public class PaybackCard extends CardApp {

	
	private int pointsEarned;
	 private double totalAmount;
	public PaybackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "PaybackCard \n PointsEarned=" + getPointsEarned() + "\n " + "TotalAmount=" + getTotalAmount() + "\n"
				+ " HolderName=" + getHolderName() + "\n" + " CardNumber=" + getCardNumber() + "\n" + " ExpiryDate=" + getExpiryDate() + " ";
	}
	 

}
