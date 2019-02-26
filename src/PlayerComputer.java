import java.util.Random;

public class PlayerComputer extends Player {

    private final Random rand = new Random();

    PlayerComputer(String name) {
        super(name);
    }

    @Override
    public int guess() {
        return rand.nextInt(6) + 1;

    }

}
