package kingdomApp;

public class Fish extends Animals {
    public Fish (String name, int yDisco) {
        super(id, name, yDisco);
    }

    @Override
    public void move() {
        return "swim";
    }

    @Override
    public void breathe() {
        return "gills";
    }

    @Override
    public void reproduce() {
        return "eggs";
    }
}