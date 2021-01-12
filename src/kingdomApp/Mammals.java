package kingdomApp;

public class Mammals extends Animals {
    public Mammals(String name, int yDisco) {
        super(id, name, yDisco);
    }

    @Override
    public void breathe() {
        return "lungs";
    }

    @Override
    public void move() {
        return "walk";
    }

    @Override
    public void reproduce() {
        return "livebirths";
    }
}