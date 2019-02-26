import java.util.Scanner;

/**
 * @author Falynsky
 */
public class Program {

    private static Scanner choos = new Scanner(System.in);

    public static void main(String[] args) {

        Stats stats = new Stats();
        Game game = new Game(stats);

        System.out.println("How many players?\n\t> ");

        int numerOfPlayers = choos.nextInt();
        do {
            System.out.println("Who's the Player?\n\t1. Human\n\t2. Computer\n");
            int choice = choos.nextInt();
            if (choice == 1) {
                System.out.println("Type of input\n\t1. Console\n\t2. GUI\n");
                choice = choos.nextInt();
                if (choice == 1) game.add_Player(new PlayerHuman(new ConsoleInput().getText()));
                else if (choice == 2) game.add_Player(new PlayerHuman(new GUIInput().getText()));
            } else if (choice == 2) {
                game.add_Player(new PlayerComputer("Computer"));
            } else {
                System.out.println("\t@@Wrong value... Try Again@@\n");
                numerOfPlayers++;
            }
            numerOfPlayers--;
        } while (numerOfPlayers != 0);

        int removeDecision;
        do {
            System.out.print("Do you want to remove one of the players?\n1. YES 2. NO\n>");

            removeDecision = choos.nextInt();


            if (removeDecision != 1 && removeDecision != 2) System.out.println("I don't understand. Try again.. \n");
            else if (removeDecision == 1) {
                System.out.print("What's the name of Player to remove? > ");
                choos.nextLine();
                String nameOfPlayerToRemove = choos.nextLine();
                game.removePlayer(nameOfPlayerToRemove);
            }
        } while (removeDecision != 2);


        for (int i = 0; i < 5; ++i) {
            System.out.println("\n" + (i + 1) + "# Round\n");
            game.play();
        }

        stats.print();


    }
}
//typy uog?lnione - dla zainteresowanych , tzn. mnie :)fgry6iikiti8ht5
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


		
		