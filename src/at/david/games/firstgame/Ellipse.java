package at.david.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Ellipse implements Actor {
    private float x,y;
    private float speed;

    public Ellipse(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = 10;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(x,y,30,10);
    }

    public void update(GameContainer gameContainer, int delta) {
        this.x += (float) delta / this.speed;
        this.y += (float) delta / this.speed;

        if (this.y > 800) {
            this.y = 0;
        } else if (this.x > 800) {
            this.x = 0;
        }
    }
}
