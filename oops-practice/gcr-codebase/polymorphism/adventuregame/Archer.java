package oops_practice.gcrcodebase.polymorphism.adventuregame;
public class Archer extends GameCharacter {

    public Archer(String characterName) {
        super(characterName);
    }

    public void performAttack() {
        System.out.println(characterName + " attacks using a bow and arrow.");
    }
}