package uk.co.isaaclee.games.level.tile;

import uk.co.isaaclee.games.graphics.Screen;
import uk.co.isaaclee.games.graphics.Sprite;

public class GrassTile extends Tile {

    public GrassTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

}
