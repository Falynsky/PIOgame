import java.util.Scanner;

public abstract class Player {

	protected String name = "Player";
	private static Scanner choose ;
	final String regex = "^[a-zA-Z][a-zA-Z0-9._@-]+$";
	private TextInput in;

	public Player(TextInput in) {
		this.in = in;
	}

	public Player(TextInput in, String name) {
		this.in = in;
		this.setName(name);
	}
	
	public void setTextInput(TextInput in){
		
		this.in = in;
		
	}
	public void askForName(){
		//ConsoleInput in = new ConsoleInput();
		setName(in.getText());
	
	}
	
	@Override
	public String toString(){
		return this.getClass().getSimpleName() + " : " +name; //PlayerComputer : Player
		//return super.toString()+ " : " + name; //PlayerComputer@4554617c : Player
	}


	public void setName(String name) { // !"".equals(name) && !name.isEmpty() for objects
		if (name != null && name.matches(regex))  this.name = name;
		else { 
			throw new IllegalArgumentException("Wrong name");
			}
	}

	public String getName() {
		return name;
	}
	
	abstract public int guess();
	
}
