
public abstract class Player {

	private String name = "Player";
	final String regex = "^[a-zA-Z][a-zA-Z0-9._@-]+$";

	public Player() {
	}

	public Player(String name) {
		this.setName(name);
	}
	
	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + " : " +name; //PlayerComputer : Player
		//return super.toString()+ " : " + name; //PlayerComputer@4554617c : Player
	}

	public void setName(String name) { // !"".equals(name) && !name.isEmpty() for objects
		if (name != null && name.matches(regex))  
			this.name = name;
		else { 
			throw new IllegalArgumentException("Wrong name");
			}
	}

	public String getName() {
		return name;
	}
	
	abstract public int guess();
	
}