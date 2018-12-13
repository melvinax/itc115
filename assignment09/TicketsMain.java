
public class TicketsMain {
	public static void main (String[]args) {
		Tickets[] ticket = new Tickets[5];
		ticket[0] = new walkupTicket(1,50);
		ticket[1] = new advanceTicket(2,30);
		ticket[2] = new advanceTicket(3,40);
		ticket[3] = new studentAdvanceTicket(4,15);
		ticket[4] = new studentAdvanceTicket(5,20);
		
		for (int i = 0; i<5; i++) {
			System.out.println(ticket[i]);
		}
	}

}
