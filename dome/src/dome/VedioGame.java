package dome;

public class VedioGame extends Item {
	private int numberOfPlayers;

	public VedioGame(String title, int playingTime, boolean gotIt,
			String comment, int number) {
		super(title, playingTime, gotIt, comment);
		// TODO Auto-generated constructor stub
		numberOfPlayers = number;
	}
	
	@Override
	public void print(){
		System.out.print("VedioGame:");
		super.print();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
