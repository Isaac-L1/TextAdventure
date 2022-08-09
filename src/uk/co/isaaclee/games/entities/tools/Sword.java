package uk.co.isaaclee.games.entities.tools;

public class Sword extends Tool {

    public int sharpness;

    public Sword(int id, String name, int durability, int sharpness) {
        super(id, name, durability);
        this.sharpness = sharpness;
    }

}
