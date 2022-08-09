package uk.co.isaaclee.games;

import uk.co.isaaclee.games.entities.characters.Player;

public class Game {

    public static void main(String[] args) {
        Player player = new Player();
        InputHandler input = new InputHandler();
        String a = input.getInput("Enter a number:");
        System.out.println(a);
    }

}
