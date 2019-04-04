import java.util.Random;
import java.util.Scanner;

public class makeGuesses {
	public static void main(String[]args) {
		System.out.println("Make a guess from");
		System.out.println("1 to 50 until a specific guess comes up.");
		System.out.println();
		
		Scanner console = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("Pick a number between 1 and 50--> ");
		int number = console.nextInt();
		
		int result = -1; //set so we enter loop
		int count = 0;
		while (result != 48) {
			result = r.nextInt(50) + 1; // random number between 1 -50 but above 48wins
			System.out.println("guess = " + result);
			count++;
		}
		System.out.println("total guesses " + count);
		
	}
		
	}
	
