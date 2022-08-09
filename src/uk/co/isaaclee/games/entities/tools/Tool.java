package uk.co.isaaclee.games.entities.tools;

import uk.co.isaaclee.games.entities.Entity;

public class Tool extends Entity {

    public int durability;

    public Tool(int id, String name, int durability) {
        super(id, name);
        this.durability = durability;
    }

}
