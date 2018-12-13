
public abstract class Tickets {
private int number;

	public Tickets(int number) {
		this.number = number;
	}
	public Tickets() {
		// TODO Auto-generated constructor stub
	}
	public double getPrice() {
		return 50.00;
	}
	
	public String toString() {
		return "number" + this.number + " , Price: " + this.getPrice();
	}
}
