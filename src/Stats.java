import java.util.HashMap; 
import java.util.Map; 

public class Stats {
	HashMap<String, Integer> map = new HashMap<>(); 
	

	void andTheWinnerIs(String name) {
		int score = map.getOrDefault(name, 0);
		++score;
		map.put(name, score);
	}
	void print(){
		for (String name : map.keySet()){
			System.out.println(name + " : " + map.get(name));
		}
	}
	
	void reset(){
		map.clear();
	}
}
