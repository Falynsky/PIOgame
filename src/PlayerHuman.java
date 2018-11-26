

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

public class PlayerHuman extends Player {

    //DRY - don't repeat yourself
    private final Scanner cin = new Scanner(System.in);

    public PlayerHuman(TextInput in) {
        super(in);
    }

    public PlayerHuman(TextInput in, String name) {
        super(in, name);
    }
    
    public PlayerHuman(String name) {
        super( name);
    }

    @Override
    public int guess() {
        System.out.print("Wpisz " + getName() + " liczbe 1 - 6: ");
        return cin.nextInt();
    }
}
