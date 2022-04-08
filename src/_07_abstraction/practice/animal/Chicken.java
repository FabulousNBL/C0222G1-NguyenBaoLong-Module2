package _07_abstraction.practice.animal;

import _07_abstraction.practice.animal.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
