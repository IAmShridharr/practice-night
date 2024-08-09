package classes;

public class Baccha extends Insaan {
	
	Baccha(int haath, int per) {
		super(haath, per);
	}

	public static void main(String[] args) {
		Baccha baccha = new Baccha(4, 2);
		
		baccha.run();
		baccha.sleep();
		baccha.talk();
		
//		baccha.setHands(2);
//		baccha.setLegs(2);
		
		System.out.println(baccha.getHands());
	}
}
