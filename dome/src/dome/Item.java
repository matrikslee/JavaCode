package dome;

public class Item {
	private String title = "";
	
	Item(String title){
		this.title = title;
	}
	public void print(){
		System.out.println(title);
	}
}
