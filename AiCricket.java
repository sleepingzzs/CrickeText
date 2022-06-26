import java.util.Random;
import java.util.Scanner;

class AiCricket {

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			Random random = new Random();

			System.out.println(
				" _     _  _______  ___      _______  _______  __   __  _______        _______  _______        _______  ___         _______  ______    ___   _______  ___   _  _______  _______ "
			);
			System.out.println(
				"| | _ | ||       ||   |    |       ||       ||  |_|  ||       |      |       ||       |      |   _   ||   |       |       ||    _ |  |   | |       ||   | | ||       ||       |"
			);
			System.out.println(
				"| || || ||    ___||   |    |       ||   _   ||       ||    ___|      |_     _||   _   |      |  |_|  ||   |       |       ||   | ||  |   | |       ||   |_| ||    ___||_     _|"
			);
			System.out.println(
				"|       ||   |___ |   |    |       ||  | |  ||       ||   |___         |   |  |  | |  |      |       ||   |       |       ||   |_||_ |   | |       ||      _||   |___   |   | "
			);
			System.out.println(
				"|       ||    ___||   |___ |      _||  |_|  ||       ||    ___|        |   |  |  |_|  |      |       ||   |       |      _||    __  ||   | |      _||     |_ |    ___|  |   |  "
			);
			System.out.println(
				"|   _   ||   |___ |       ||     |_ |       || ||_|| ||   |___         |   |  |       |      |   _   ||   |       |     |_ |   |  | ||   | |     |_ |    _  ||   |___   |   |  "
			);
			System.out.println(
				"|__| |__||_______||_______||_______||_______||_|   |_||_______|        |___|  |_______|      |__| |__||___|       |_______||___|  |_||___| |_______||___| |_||_______|  |___|  "
			);
			System.out.println("\n \n \n");
			System.out.println("Choose game mode! Batting[0] / Balling[1]");

			int score = 0;
			int runs;
			int mode = obj.nextInt();
			int randomNumber = random.nextInt((6 - 1) + 1) + 1;

			if (mode != 0 && mode != 1) {
				System.out.println("Invalid game mode!");
			}
			while (mode == 0) {
				System.out.println("\n" + "\n");
				System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
				);
				System.out.println(
					"You are now batting! \nEnter the number of runs from 1 to 6"
				);
				System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
				);
				System.out.print("\nYour runs: ");
				runs = obj.nextInt();
				if (runs < 1 || runs > 6) {
					System.out.println("\n" + "\n");
					System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
					);
					System.out.println("Invalid number \nGAME OVER");
					System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
					);
					break;
				} else if (runs == randomNumber) {
					System.out.println("\n" + "\n");
					System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
					);
					System.out.println(
						"Ai's runs: " +
						randomNumber +
						"\nYour number: " +
						runs +
						"\nGAME OVER"
					);
					System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
					);
					break;
				}
				score += runs;
				System.out.println("Your current score: " + score + "\n");
			}
			while (mode == 1) {
				System.out.println("Mode is not available yet!");
				break;
			}
		}
	}
}
