package poc.java.sync;

import poc.java.sync.logic.BookTicket;

public class ThreadSync
{
	public static void main(String[] args) 
	{
		BookTicket bookTicket = new BookTicket();
		Thread s = new Thread(bookTicket, "Sandeep");
		Thread k = new Thread(bookTicket, "Kushang");
		k.start();
		s.start();
	}

}