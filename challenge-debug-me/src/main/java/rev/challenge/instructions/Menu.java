package rev.challenge.instructions;

import java.util.Scanner;

import rev.challenge.Driver;
import rev.challenge.model.Map;
import rev.challenge.model.Player;

public class Menu {

	public static void logo() {
		System.out.println("\t\t\t\t |||||    |||||   ||||    || ||   ||| ");
		System.out.println("\t\t\t\t ||  ||   ||      || ||   || ||   |   ");
		System.out.println("\t\t\t\t ||  ||   |||||   ||||    || ||   | |||");
		System.out.println("\t\t\t\t ||  ||   ||      || ||   || ||   |  |");
		System.out.println("\t\t\t\t |||||    |||||   ||||     |||    ||||");
		System.out.println("");
		System.out.println("\t\t\t\t               ||    ||     |||||    ");
		System.out.println("\t\t\t\t              ||||  ||||    ||       ");
		System.out.println("\t\t\t\t              ||  ||  ||    |||||    ");
		System.out.println("\t\t\t\t              ||      ||    ||       ");
		System.out.println("\t\t\t\t              ||      ||    |||||    ");
	}
	public static void menu(Scanner s) {
		System.out.println("\tSELECT ONE OF THE FOLLOWING");
		System.out.println("(1) START");
		System.out.println("(2) INSTRUCTIONS");
		System.out.println("(3) LEADERBOARD");
		System.out.println("(4) END");
		int x = s.nextInt();
		switch(x) {
		case 1: start(s);
		break;
		case 2: System.out.println("TODO: INSTRUCTIONS");
		case 3:
			System.out.println(Leaderboard.printLeaders());
			Driver.main(new String[0]);
			break;
		case 4: break;
		default: Driver.main(new String[0]);
		}
	}
	static Player p;
	private static void start(Scanner s) {
		System.out.println("what is your name?");
		s.nextLine();
		p.setName(s.nextLine());//throwing null pointer
		System.out.println("here is the Map");
		Map m = new Map(p);
		while(p.getHealth()>0) { // This line reads "If your health is less than 0, do this. Since \\
								// health should be greater than 0 to start, this line is unexecutab\\
			System.out.println(m);
			System.out.println("where would you like to move?");
			m.move(s.next());
			m.consequences(s);
		}
		System.out.println("you lose");
		System.exit(0);
	}

}
