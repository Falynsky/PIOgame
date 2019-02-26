import java.util.HashMap;

class Stats {
    private HashMap<String, Integer> map = new HashMap<>();


    void andTheWinnerIs(String name) {
        int score = map.getOrDefault(name, 0);
        ++score;
        map.put(name, score);
    }

    void print() {

        System.out.println("\n==========================================================\n" +
                "Stats from this game:\n" +
                "==========================================================\n");
        for (String name : map.keySet()) {
            System.out.println("\t" + name + " : " + map.get(name));
        }
        reset();
    }

    private void reset() {
        map.clear();
    }
}
