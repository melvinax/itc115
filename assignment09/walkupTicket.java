
public class walkupTicket extends Tickets {
	private int day;

	
	public walkupTicket(int number, int day) {
		super(number);
		this.day = day;
		this.getPrice();
	}
	
	public double getPrice() {
		
			return 50.00;
		
	}
	public String toString() {
		
			return super.toString() + " (" + this.day + " day)";
		
	}
}



