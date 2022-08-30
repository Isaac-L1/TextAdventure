package uk.co.isaaclee.games.graphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpriteSheet {

    private final String PATH;
    public final int SIZE;
    public final int[] pixels;

    public static final SpriteSheet tiles = new SpriteSheet("/textures/tiles.png", 256);

    public SpriteSheet(String path, int size) {
        SIZE = size;
        PATH = path;
        pixels = new int[size*size];
        load();
    }

    private void load() {
        try {
            BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(PATH));
            int w = image.getWidth();
            int h = image.getHeight();
            image.getRGB(0, 0, w, h, pixels, 0, w);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
