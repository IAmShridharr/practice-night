import java.util.Scanner;

public class July29 {
	
	public static void main(String[] args) {
		Scanner abhiRavi = new Scanner(System.in);
		
		System.out.println("How many times do you want to give rating?");
		int i = abhiRavi.nextInt();
		
		while (i > 0) {
			System.out.println("Give rating: ");
			int rating = abhiRavi.nextInt();
			switch(rating) {
				case 1: {
					System.out.println("Majaa nai aaya");
					break;
				}
				case 2: {
					System.out.println("Aur accha ho sakta tha");
					break;
				}
				case 3: {
					System.out.println("Thik thaak hai");
					break;
				}
				case 4: {
					System.out.println("Accha hai");
					break;
				}
				case 5: {
					System.out.println("Majaa aa gaya");
					break;
				}
				default: {
					System.out.println("Bohot jaada rating de diya");
				}
			}
			i--;
		}
		abhiRavi.close();
	}
}
