import java.util.Scanner;

public class ConsoleInput implements TextInput{
	
	private static Scanner choose ;
	
	public String getText(){
		String text = null;
		System.out.print("What's Your name?\n\nOh, My name is ");
		text = choose.nextLine();
		return text;
		
	}

}
