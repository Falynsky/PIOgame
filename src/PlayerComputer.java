
import java.util.Random;

public class PlayerComputer extends Player {

	private final Random rand = new Random();
	
	public PlayerComputer(TextInput in) {
		super(in);
	}

	public PlayerComputer(TextInput in, String name) {
		super(in, name);
	}

	public int guess() {
		int value = 0;

		value = rand.nextInt(6) + 1;

		return value;

	}
	
	

}
