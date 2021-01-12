package kingdomApp;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Animals> animalsList = new ArrayList<>();
        //Mammals
        animalsList.add(new Mammals("Panda", 1869));
        animalsList.add(new Mammals("Zebra", 1778));
        animalsList.add(new Mammals("Koala", 1816));
        animalsList.add(new Mammals("Sloth", 1804));
        animalsList.add(new Mammals("Armadillo", 1758));
        animalsList.add(new Mammals("Raccoon", 1758));
        animalsList.add(new Mammals("Bigfoot", 2021));
        //Birds
        animalsList.add(new Birds("Pigeon", 1837));
        animalsList.add(new Birds("Peacock", 1821));
        animalsList.add(new Birds("Toucan", 1758));
        animalsList.add(new Birds("Parrot", 1824));
        animalsList.add(new Birds("Swan", 1758));
        //Fish
        animalsList.add(new Fish("Salmon", 1758));
        animalsList.add(new Fish("Catfish", 1817));
        animalsList.add(new Fish("Perch", 1758));

        animalsList.sort((a1, a2) -> a2.getyDisco() - a1.getyDisco());
        animalsList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalsList.sort((a1, a2) -> a1.move() - a2.move());
        printFilteredAnimals(animalsList, (a) -> a.breathe() === "lungs");
        printFilteredAnimals(animalsList, (a) -> a.breathe() === "lungs" && a.getyDisco === 1758);
        printFilteredAnimals(animalsList, (a) -> a.reproduce() === "eggs" && a.breathe() === "lungs");
        printFilteredAnimals(animalsList, (a) -> a.getyDisco() === 1758 && );
    }

    public static void printFilteredAnimals(List<Animals> animalsList, AnimalTester animalTester){
        for(Animals a: animalsList) {
            if(animalTester.test(a)){
                System.out.println(a);
            }
        }
    }
}