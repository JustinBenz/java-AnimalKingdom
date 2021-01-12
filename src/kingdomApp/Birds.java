package kingdomApp;

public class Birds extends Animals {
    public Birds (String name, int yDisco) {
        super(id, name, yDisco);
    }

    @Override
    public void breathe() {
        System.out.println("Usin our Lungs");
    }

    @Override
    public void move(){
        System.out.println("Soarin, Flyin, there's not a star in heaven that we cant reach");
    }

    @Override
    public void reproduce() {
        System.out.println("Poppin out some eggs");
    }
}