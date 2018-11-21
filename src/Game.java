/**
 *
 * @author Falu
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {

	//protected Player player;
	protected Random rand = new Random();
	protected List<Player> players = new ArrayList<>();

	public void add_Player(Player player) {
		if(player!=null){	
			
			if(isPlayersNameOnList(player)){
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
	
	private boolean isPlayersNameOnList(Player player){
		for(Player p : players)
		{
			if(p.getName().equals(player.getName())) {
				return true;
			} 
		}
		return false;	
	}
	
	public void removePlayer(String name) {
		Iterator<Player> it = players.iterator();
		while(it.hasNext()){
			Player p = it.next();
			if(p.getName().equals(name)) {
				it.remove();
			}
		}
//		for(int i = 0; i < players.size(); i++) {
//			if(players.get(i).equals(name)) players.remove(i);
//			break;
//		} 

	}

	public void play() {
		int guess, cube;
		boolean oneMore = true;
		
		try{
			 for(Player player : players){
				player.askForName();
	        }			
		} catch (Exception ex) {
			System.err.println("ERROR " + ex.getMessage());
			}
		guess = 0;
		cube = 0;
		int i = 0;
		do {
			cube = rand.nextInt(6) + 1;
			for(Player player : players){
				
				guess = player.guess();
				i++;
	        

			if (guess != cube)
				System.out.println("Wrong!  " + player.getName() + ", Value of Cube = " + cube + " and Your guess = " + guess);
			else{
				System.out.println("Well done! " + player.getName() + " You're right!" + ", Value of Cube = " + cube);
				oneMore = false;
				}
			}	
		}while (oneMore);
	}
}
