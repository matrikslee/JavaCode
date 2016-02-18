package dome;

public class DVD extends Item {
	private String director = "";
	DVD(String title, String director) {
		super(title);
		this.director = director;
	}
	
	public void print(){
		super.print();
		System.out.println(director);
	}

	public static void main(String[] args) {
	}

}
