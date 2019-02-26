/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author student
 */
import java.util.Scanner;

public class ConsoleInput implements TextInput {

    private static Scanner choose = new Scanner(System.in);

    public String getText() {
        String text = null;
        System.out.print("What's Your name?\n\nOh, My name is ");
        text = choose.nextLine();
        System.out.println();
        return text;
    }

}
