package kingdomApp;

public class Birds extends Animals {
    public Birds (String name, int yDisco) {
        super(id, name, yDisco);
    }

    @Override
    public String breathe() {
        return "lungs";
    }

    @Override
    public String move(){
       return "fly";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}