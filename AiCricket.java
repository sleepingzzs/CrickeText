/*
 * Author: bizi
 * Github: https://github.com/sleepingzzs
 * Description: A text based cricket game 
 */

import java.util.Random;
import java.util.Scanner;

class AiCricket {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
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

			int score = 0;
			int ai_score = 0;
			int runs;
			int bowls;
			int mode = 0;
			int randomNumber;

			if (mode != 0 && mode != 1) {
				System.out.println("Invalid game mode!");
			}
			while (mode == 0) {
				randomNumber = random.nextInt((6 - 1) + 1) + 1;
				System.out.println("\n");
				System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
				);
				System.out.println(
					"You are now BATTING! \nEnter the number of runs from 1 to 6"
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
						"Ai's bowled for: " +
						randomNumber +
						"\nYour runs: " +
						runs +
						"\nFinal score: " +
						score +
						"\nGAME OVER"
					);
					System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
					);
					mode = 1;
				}
				score += runs;
				if (score >= 100) {
					System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
					);
					System.out.println("Century!");
					System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
					);
					mode = 1;
				}
				System.out.println("Your current score: " + score + "\n");
			}
			while (mode == 1) {
				randomNumber = random.nextInt((6 - 1) + 1) + 1;
				System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
				);
				System.out.println(
					"You are now BOWLING! \nEnter the number of runs from 1 to 6"
				);
				System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
				);
				System.out.print("Bowl: ");
				bowls = obj.nextInt();

				if (bowls < 0 || bowls > 6) {
					System.out.println("\n" + "\n");
					System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
					);
					System.out.println("Invalid number \nGAME OVER");
					System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
					);
					break;
				}
				ai_score += randomNumber;
				if (bowls == randomNumber) {
					if (score < ai_score) {
						System.out.println(
							"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
						);
						System.out.println(
							"AI is out! \nYour final score:" +
							score +
							"\nAI's final score: " +
							ai_score +
							"\nYOU LOSE!"
						);
						System.out.println(
							"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
						);
						break;
					}
					if (score > ai_score) {
						System.out.println(
							"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
						);
						System.out.println(
							"AI is out! \nYour final score:" +
							score +
							"\nAI's final score: " +
							ai_score +
							"\nYOU WIN!"
						);
						System.out.println(
							"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
						);
						break;
					}
					if (score == ai_score) {
						System.out.println(
							"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
						);
						System.out.println(
							"AI is out! \nYour final score:" +
							score +
							"\nAI's final score: " +
							ai_score +
							"\nDRAW!"
						);
						System.out.println(
							"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
						);
						break;
					}
				} else if (ai_score > score) {
					System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
					);
					System.out.println(
						"AI score out-scored yours \nYour final score:" +
						score +
						"\nAI's final score: " +
						ai_score +
						"\nYOU LOSE!"
					);
					System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
					);
					break;
				}
			}
		obj.close();
		
	}
}
