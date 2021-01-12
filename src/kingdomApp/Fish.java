package kingdomApp;

public class Fish extends Animals {
    public Fish (String name, int yDisco) {
        super(id, name, yDisco);
    }

    @Override
    public void move() {
        System.out.println("just swimmin");
    }

    @Override
    public void breathe() {
        System.out.println("these gills bussin");
    }

    @Override
    public void reproduce() {
        System.out.println("poppin out some sushi");
    }
}