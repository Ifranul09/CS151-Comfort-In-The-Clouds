package comfortInTheCloud;

//singleton: one BusinessSeat's alteration alters all the business seats!
public class BusinessSeat extends Seat{
	public BusinessSeat(boolean window, boolean longLeg) {
		super(window, longLeg);
		// TODO Auto-generated constructor stub
	}



	private static double price = 500;
	
	public double getPrice() {
		return BusinessSeat.price;
	}
	

	
	public String seatInfo() {
		StringBuilder info = new StringBuilder();
		if (getPerson() != null) {
        info.append("Customer's name: " + this.getPerson().getName() + "\n");
		}
        info.append("Chosen to fly Business Class. Total price (extra costs included): " + (getPrice() + getExtraPrice()) + "\n");
        if(this.isWindow()){
          	info.append("You have chosen a window seat. Total flight price increased by 20 dollars" + "\n");
          }
          else {
          	info.append("You have not chosen a window seat. No extra charges made"+ "\n");
          }
          
          if(this.isLongLeg()) {
          	info.append("You have chosen a long-leg seat. Total flight price increased by 10 dollars" + "\n");
          }
          else {
          	info.append("You have not chosen a long-leg seat. No extra charges made" + "\n");
          }
        
        info.append("Number of Carry-on Luggage Allowed: 2");
        return info.toString();
	}
}
