package kingdomApp;

import java.util.*;

public abstract class Animals {
    protected static int id;
    protected String name;
    protected int yDisco;

    public Animals (int id, String name, int yDisco) {
        this.id = new Random().nextInt(20);
        this.name = name;
        this.yDisco = yDisco;
    }

    public int getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getyDisco() {
        return yDisco;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setyDisco(int yDisco) {
        this.yDisco = yDisco;
    }

    protected void eat() {
        System.out.println("Nom Nom Nom");
    }

    protected abstract String move();
    protected abstract String breathe();
    protected abstract String reproduce();
}
