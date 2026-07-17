package oops_practice.gcrcodebase.polymorphism.adventuregame;

public class GameCharacter {

    String characterName;

    public GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public void performAttack() {
        System.out.println(characterName + " attacks.");
    }
}
