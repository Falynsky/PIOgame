
import java.util.Scanner;

public class PlayerHuman extends Player {

	//DRY - don't repeat yourself
	
	private final Scanner in = new Scanner(System.in);

	public PlayerHuman() {
	}

	public PlayerHuman(String name) {
		super(name);
	}
	
	@Override
	public int guess() {
		  System.out.print("Wpisz "+getName()+" liczbe 1 - 6: ");
		  return in.nextInt();
	}
}
