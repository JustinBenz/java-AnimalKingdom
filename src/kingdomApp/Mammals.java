package kingdomApp;

public class Mammals extends Animals {
    public Mammals(String name, int yDisco) {
        super(id, name, yDisco);
    }

    @Override
    public void breathe() {
        System.out.println("Usin our lungs");
    }

    @Override
    public void move() {
        System.out.println("AY IM WALKIN HERE");
    }

    @Override
    public void reproduce() {
        System.out.println("A new animal popped out!");
    }
}