package poc.java.sync.logic;

public class BookTicket implements Runnable
{
	private int totalSeats = 2;
	
	synchronized public void confirm(String name)
	{
		System.out.print("\n" + name + " : " + totalSeats + " seats are avalable");
		if(totalSeats > 0)
		{
			System.out.println(" : Tickets booked");
			totalSeats = totalSeats - 2;
		}
		else
		{
			System.out.println(" : Ticket booking failed");
		}
	}

	public void run() {
		confirm(Thread.currentThread().getName());
	}
}
