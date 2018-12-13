
public class advanceTicket extends Tickets {
	private int day;
	
	public advanceTicket(int number, int day) {
		super(number);
		this.day = day;
	}
	
	public double getPrice() {
		if (day >= 10) {
			return 30.00;
		} else {
			return 40.00;
		}
	}
	public String toString() {
		if (day >= 10) {
			return super.toString() + " (" + this.day + " day)";
		} else {
			return super.toString() + " (" + this.day + " day)";
		}
	}
}
