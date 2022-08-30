package uk.co.isaaclee.games.graphics;

import uk.co.isaaclee.games.level.tile.Tile;

import java.util.Arrays;
import java.util.Random;

public class Screen {

    public int width, height;
    public int[] pixels;
    public static int MAP_SIZE = 64;
    public int xOffset, yOffset;
    public int[] tiles = new int[MAP_SIZE*MAP_SIZE];
    public static int tile_size = 16;

    private Random random = new Random();

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width*height];
    }

    public void clear() {
        Arrays.fill(pixels, 0);
    }

    public void renderTile(int xp, int yp, Tile tile) {
        xp -= xOffset;
        yp -= yOffset;
        for (int y = 0; y < tile.sprite.SIZE; y++) {
            int ya = y + yp;
            for (int x = 0; x < tile.sprite.SIZE; x++) {
                int xa = x + xp;
                if (xa < -tile.sprite.SIZE || xa >= width || ya < 0 || ya >= height) break;
                if (xa < 0) xa = 0;
                pixels[xa + ya * width] = tile.sprite.pixels[x + y * tile.sprite.SIZE];
            }
        }
    }

    public void setOffset(int xOffset, int yOffset) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

}
