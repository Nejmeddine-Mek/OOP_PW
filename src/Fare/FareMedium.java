package Fare;

import java.util.Date;

public class FareMedium {
	private static int idGenerator = 1;
	String ID;
	float price;
	Date dateAndTime;
	boolean activated;
	//payment method
	//zone
	
	public FareMedium(float price) {
		this.ID = "Fare" + "Date/Time" + Integer.toString(FareMedium.idGenerator++);
		this.price = price;
		this.dateAndTime = new Date();
		this.activated = false;
	}
}
