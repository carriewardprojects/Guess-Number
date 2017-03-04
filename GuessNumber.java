import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		//Generate a random number to be guessed
		int number = (int)(Math.random() * 100);

		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");

		//it would be benificial to begin a loop here to allow
		//the user to have multiple guesses until they arrive
		//at the magic number
		System.out.System.out.print("Enter your guess:");
		int guess = input.nextInt();

		if(guess == number)
			System.out.println("Yes! The number is " + number);
		else if (guess > number)
			System.out.println("Nope. Your guess was too high."
					+ " The magic number is " + number);
		else
			System.out.println("Nope. Your guess was too low."
					+ " The magic number is " + number);

		System.out.println("\nThank you for playing!");

	}

}
