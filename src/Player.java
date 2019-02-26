public abstract class Player {

    private String name = "Default Player";

    Player(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : " + name; //PlayerComputer : Player
        //return super.toString()+ " : " + name; //PlayerComputer@4554617c : Player
    }

    void setName(String name) { // !"".equals(name) && !name.isEmpty() for objects
        String regex = "^[a-zA-Z][a-zA-Z0-9._@-]+$";
        if (name != null && name.matches(regex)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Wrong name");
        }
    }

    String getName() {
        return name;
    }

    abstract public int guess();
}
