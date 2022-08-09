package uk.co.isaaclee.games.entities.characters;

import uk.co.isaaclee.games.entities.Entity;

public class Character extends Entity {

    public int health;
    public int mana;

    public int magic;
    public int strength;
    public int agility;
    public int charisma;
    public int max_health;
    public int max_mana;

    public Character(int id, String name, int max_health, int max_mana) {
        //Initialise Entity Object
        super(id, name);

        //Initialise the Stats
        this.max_health = max_health;
        this.max_mana = max_mana;
        this.magic = 0;
        this.strength = 0;
        this.agility = 0;
        this.charisma = 0;

        //Initialise the modifiables
        this.health = max_health;
        this.mana = max_mana;
    }

    public Character(int id, String name, int max_health, int max_mana, int magic, int strength, int agility, int charisma) {
        //Initialise Entity Object
        super(id, name);

        //Initialise the Stats
        this.max_health = max_health;
        this.max_mana = max_mana;
        this.magic = magic;
        this.strength = strength;
        this.agility = agility;
        this.charisma = charisma;

        //Initialise the modifiables
        this.health = max_health;
        this.mana = max_mana;
    }

}
