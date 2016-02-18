package clock;

import clock.display.Display;

public class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	
	public void tick(){
		minute.tick();
		if( minute.getValue() == 0 ) {
			hour.tick();
		}
	}
	
	public void show() {
//		System.out.println(hour.getValue()+":"+minute.getValue());
//		System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
		System.out.println(hour+":"+minute);
	}
	
	public static void main(String[] args){
		Clock c = new Clock();
		while ( true ) {
			c.tick();
			c.show();
		}
	}
	
}
