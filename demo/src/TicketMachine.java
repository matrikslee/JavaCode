
public class TicketMachine {
	private int price = 100;
	private int balance = 0;
	private int total = 0;
	private String name = "";
	
	public TicketMachine(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public void showPrompt(){
		System.out.println("Welcome to buy "+name+" Line ticket.");
		System.out.println("The price is: "+price);
	}
	
	public void insertMoney(int bill){
		balance += bill;
		printBalance();
	}
	
	public void printTicket(){
		if( balance >= price ) {
			System.out.println("THE TICKET");
			balance -= price;
			if( balance > 0 ) {
				System.out.println("change is " + balance);
			}
			balance = 0;
		}
		total += price;
	}
	
	public void printBalance(){
		System.out.println("Balance is： "+balance);
	}
	
	public void printTotal(){
		System.out.println("Total sell is "+total);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TicketMachine tm = new TicketMachine("Blue", 80);
		tm.showPrompt();
	}

}
