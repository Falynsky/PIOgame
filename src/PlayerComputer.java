/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author student
 */
import java.util.Random;

public class PlayerComputer extends Player {

    private final Random rand = new Random();

//    public PlayerComputer(String name) {
//        super(name);
//    }
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
