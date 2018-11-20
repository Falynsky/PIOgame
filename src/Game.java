import java.util.Random;

public class Game {

	protected Player player;
	protected Random rand = new Random();

	public void add_Player(Player player) {
		this.player = player;

	}

	public void play() {
		try {
			player.askForName();
		} catch (Exception ex) {
			System.err.println("Bład " + ex.getMessage());
		}

		int guess = 0;
		int cube = 1;
		while (guess != cube) {
			cube = rand.nextInt(6) + 1;
			guess = player.guess();

			if (guess != cube)
				System.out.println("Wrong! Value of Cube = " + cube + " and Your guess = " + guess);
			else
				System.out.println("Well done! " + player.getName() + " You're right!");

		}
	}
}
