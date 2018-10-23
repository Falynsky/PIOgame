
public abstract class Player {

	private String name = "Player";

	public Player() {
	}

	public Player(String name) {
		this.setName(name);
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) { // !"".equals(name) &&
												// !name.isEmpty() for objects
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}
	
	abstract public int guess();
	
}
