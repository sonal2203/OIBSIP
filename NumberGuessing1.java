import java.util.Scanner;

public class NumberGuessing1 {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int minRange = 1;
	        int maxRange = 100;

	        int mynum = generateRandomNumber(minRange, maxRange);
	        int guess;
	        int attempt = 0;
            int repeat;
	        do {
	            System.out.print("Guess the number between " + minRange + " and " + maxRange + ": ");
	            // Taking input of number
	            guess = sc.nextInt();
	            int diff=guess-mynum;

	            if (guess == mynum) {
	                System.out.println("Congrats! You guessed the right number.\n");
	                System.out.print("You guessed the number in " + attempt + " attempts.\n");

	                attempt = 0;
	                System.out.print("Do you want to play again? (1/0) : ");

	                repeat = sc.nextInt();
	                mynum = generateRandomNumber(minRange, maxRange);

	                System.out.println();
	            } else if (diff > 50) {
	                System.out.println("Your number is far away from the correct answer.\n");
	            }
	           else if (guess > mynum) {
	                System.out.println("Your number is larger than the correct answer.\n");
	            }
	            else {
	                System.out.println("Your number is smaller than the right answer.\n");
	            }

	            attempt++;

	        } while (attempt <= 4);

	        System.out.println("Oops! Looks like you have reached the maximum number of attempts. \nThanks  for playing!");
	        System.out.println("The number was: "+mynum);
	        sc.close();
	    }

	    // Helper method to generate a random number between min and max (inclusive).
	    private static int generateRandomNumber(int min, int max) {
	        return (int) (Math.random() * (max - min + 1)) + min;
	    }
	}
