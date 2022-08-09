package uk.co.isaaclee.games.entities.characters;

public class Enemy extends Character {

    public int aggression;

    public Enemy(int id, String name, int max_health, int max_mana, int magic, int strength, int agility, int charisma, int aggression) {
        super(id, name, max_health, max_mana, magic, strength, agility, charisma);
        this.aggression = aggression;
    }

}
