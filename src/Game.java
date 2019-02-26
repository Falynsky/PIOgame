import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class Game {

    private Random rand = new Random();
    private Stats stats = new NullStatistics();
    private List<Player> players = new ArrayList<>();

    public Game() {
    }

    Game(Stats stats) {
        this.stats = stats;
    }

    void add_Player(Player player) {
        if (player != null) {

            if (isPlayersNameOnList(player)) {
                String name = player.getName();
                name += "@";
                player.setName(name);
                add_Player(player);
            } else {
                players.add(player);
            }
        } else throw new IllegalArgumentException("Player cannot be null");
        //this.player = player;
    }

    private boolean isPlayersNameOnList(Player player) {
        for (Player p : players) {
            if (p.getName().equals(player.getName())) {
                return true;
            }
        }
        return false;
    }

    void removePlayer(String name) {

        Iterator<Player> it = players.iterator();
        do {
            Player p = it.next();
            if ((p.getName()).equals(name)) {
                it.remove();
                System.out.println("Player " + name + " removed.");
            }
        } while (it.hasNext());

    }

    void play() {

        int guess, cube;
        boolean oneMore = true;
        int i = 0;
        do {
            cube = rand.nextInt(6) + 1;
            for (Player player : players) {

                guess = player.guess();
                i++;


                if (guess != cube) {
                    System.out.println("Wrong!  " + player.getName() + ", Value of Cube = " + cube + " and Your guess = " + guess);
                } else {
                    System.out.println("Well done! " + player.getName() + " You're right!" + ", Value of Cube = " + cube);
                    oneMore = false;
                    stats.andTheWinnerIs(player.getName());

                }
            }
        } while (oneMore);
    }
}
