package oops_practice.gcrcodebase.polymorphism.adventuregame;
public class Warrior extends GameCharacter {

    public Warrior(String characterName) {
        super(characterName);
    }

    public void performAttack() {
        System.out.println(characterName + " attacks using a sword.");
    }
}