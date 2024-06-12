package at.david.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor {
    private float x, y;
    private float speed;
    private int diameter;

    public Circle() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.diameter = random.nextInt(20) + 20;
        this.speed = random.nextFloat() * 40 + 10;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
    }

    public void update(GameContainer gameContainer, int delta) {
        this.y += (float) delta / this.speed;

        // Increase diameter over time
        this.diameter += (float) delta / 2.5; // Adjust growth rate as needed

        if (this.y > 800) {
            this.y = 0;
        }
    }
}
