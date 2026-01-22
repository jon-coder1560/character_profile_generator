import java.util.Scanner;

/**
 * Character Profile Generator
 *
 * This program collects information about a user's custom character,
 * including name, race, class, and several numeric stats. It demonstrates
 * the use of Java's Scanner class, handling both String and numeric input,
 * and properly managing the interaction between nextLine() and nextInt().
 *
 * The program also performs simple arithmetic by calculating an overall
 * power level based on the character's stats. It uses escape sequences
 * for clean formatting and organizes the logic into clear input,
 * processing, and output sections.
 * 
 * @author Jonathan
 */


public class CharacterProfileGenerator {

	public static void main(String[] args) {
		
		String charName;
		String charRace;
		String charClass;
		int strength;
		int health;
		int speed;
		double powerLevel;
		Scanner stdin;
		
		System.out.println("--------------------------------");
		System.out.println("   Character Profile Summary	");
		System.out.println("--------------------------------");
		
		
		stdin = new Scanner(System.in);
		System.out.print("Enter your character's name: ");
		charName = stdin.nextLine();
		System.out.print("Enter your character's race: ");
		charRace = stdin.nextLine();
		System.out.print("Enter your character's class: ");
		charClass = stdin.nextLine();
		
		System.out.print("\nEnter Strength (0-100): ");
		strength = stdin.nextInt();
		System.out.print("Enter Health (0-100): ");
		health = stdin.nextInt();
		System.out.print("Enter Speed (0-100): ");
		speed = stdin.nextInt();
		stdin.close();
		
		System.out.println("\n--------------------------------");
		System.out.println("     Final Character Sheet	");
		System.out.println("--------------------------------");
		
		powerLevel = (strength + health + speed) / 3;
		
		System.out.println("\nName: " + charName);
		System.out.println("Race: " + charRace);
		System.out.println("Class: " + charClass);
		
		System.out.println("\nStats:");
		System.out.println("\tStrength: " + strength);
		System.out.println("\tHealth: " + health);
		System.out.println("\tSpeed: " + speed);
		
		System.out.println("\nOverall Power Level: " + powerLevel);
		System.out.println("\n'May " + charName + "'s arrows fly true.'");
		System.out.println("--------------------------------");
		

	}

}
