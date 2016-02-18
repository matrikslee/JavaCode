package dome;

import java.util.ArrayList;

public class Database {
	private ArrayList<Item> items = new ArrayList<Item>();
	public void addItem(Item i){
		items.add(i);
	}
	public void list(){
		for ( Item i : items ) {
			i.print();
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Database db = new Database();
		CD cd = new CD("Owl City", 7);
		DVD dvd = new DVD("大话西游", "周星驰");
		db.addItem(cd);
		db.addItem(dvd);
		db.list();
//		Item i = cd;
//		i.print();
//		System.out.println(cd.getNot());
	}
	
}