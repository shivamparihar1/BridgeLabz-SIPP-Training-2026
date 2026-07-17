package oops_practice.gcrcodebase.polymorphism.adventuregame;
public class Mage extends GameCharacter {

    public Mage(String characterName) {
        super(characterName);
    }

    public void performAttack() {
        System.out.println(characterName + " attacks using magic spells.");
    }
}