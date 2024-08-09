package classes;

public class Insaan {
	private int hands;
	private int legs;
	
	Insaan() {
		
	}
	
	Insaan(int haath, int per) {
		this.hands = haath;
		this.legs = per;
	}
	
	void sleep() {
		System.out.println("Insaan soo gaya!");
	}
	
	void run() {
		System.out.println("Insaan bhaagne lagaa!");
	}
	
	void talk() {
		System.out.println("Insaan bolne lagaa!");
	}

	public int getHands() {
		return this.hands;
	}
	
	public void setHands(int haath) {
		this.hands = haath;
	}
	
	public int getLegs() {
		return this.legs;
	}
	
	public void setLegs(int per) {
		this.legs = per;
	}
}
