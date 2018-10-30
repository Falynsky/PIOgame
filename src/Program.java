import java.util.Random;
import java.util.Scanner;

public class Program {

	private static Scanner choose;

	public static void main(String[] args) {

		final Random rand = new Random();

		int cube;
		choose = new Scanner(System.in);

		Player player = null;
		System.out.println("Who's the Player?\n\t1. Human\n\t2. Computer\n");
		switch(choose.nextInt())
		{
		case 1: player = new PlayerHuman();
		case 2: player = new PlayerComputer();
		default:
			break;
		}
		try{
			//https://regex101.com/
			player.setName("2Kamil");

			int guess;
			do {
				cube = rand.nextInt(6) + 1;
				guess = player.guess();

				if (guess != cube)
					System.out.println(
							"Wrong " + player.getName() + "! Value of Cube = " + cube + " and Your guess = " + guess);
				else
					System.out.println("\nWell done " + player.getName() + "! You're right!");

			} while (guess != cube);
		}
//		catch (IllegalArgumentException e){
//			System.err.println("\nWrong name human :/\n");
//			//player.setName(choose.nextLine());
//		}
		catch (Exception e){
			System.out.println("\nError." +player.toString());
		}
	}
}

//lab 3