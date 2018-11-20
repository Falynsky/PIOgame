import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program {

    private static Scanner choos = new Scanner(System.in);

    public static void main(String[] args) {

      Game game = new Game(); 
    
      int numerOfPlayers = 0;
      
      System.out.println("How many players?\n\tNumber: ");
      
      numerOfPlayers = choos.nextInt();
      do{
      		System.out.println("Who's the Player?\n\t1. Human\n\t2. Computer\n");
      		int choose = choos.nextInt();
		if(choose == 1) {
                    System.out.println("Type of input\n\t1. Console\n\t2. GUI\n");
                    choose = choos.nextInt();
                    if(choose == 1)	game.add_Player(new PlayerHuman(new ConsoleInput()));
                    else if (choose == 2)	game.add_Player(new PlayerHuman(new GUIInput()));
                }

		else if (choose == 2) {
                    System.out.println("Type of input\n\t1. Console\n\t2. GUI\n");
                    choose = choos.nextInt();
                    if(choose == 1) game.add_Player(new PlayerComputer(new ConsoleInput()));
                    else if (choose == 2)	game.add_Player(new PlayerComputer(new GUIInput()));
                }
		numerOfPlayers--;
      }while(numerOfPlayers!=0);

      
      game.play();
      game.removePlayer("Kamil");

    //typy uogólnione - dla zainteresowanych , tzn. mnie :)fgry6iikiti8ht5
//      List<String> list = new ArrayList();
//      
//      list.add("raz");
//      list.add("dwa");
//      list.add("trzy");
//
//        System.out.println(list);
//        int i = 0; 
//        
//        System.out.println("WHILE HERE VVV ");
//        //tylko while
//        while(i<list.size())
//        {
//            System.out.println("\t"+list.get(i));
//            i++;
//        }
//        System.out.println("FOR EACH HERE VVV ");
//        //for each dla javy
//        for(String o : list){
//            System.out.println("\t"+o);
//        }
//        System.out.println("ITERATOR HERE VVV ");
//        Iterator<String> itr = list.iterator();
//        
//        while(itr.hasNext()){
//            System.out.println("\t"+itr.next());
//        }
        
        
//        iterator - obiekt ktroy bedzie umial p otej lsicie iterowac (ustawia sien a poczatku patrzy przed siebie zna: 
//          NEXT() - skacze to co widzie przed soba i zwraca, 
//          hasNEXT() - czy jest nastepny
//          remove() - usuwa, 
//        
//        
        
        
    }
}


		
		