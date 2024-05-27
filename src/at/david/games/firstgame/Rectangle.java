package at.david.games.firstgame;

import org.newdawn.slick.Graphics;

public class Rectangle implements Actor {
    private float x;
    private float y;
    private float speed;
    private Direction direction;

    public enum Direction {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public Rectangle(float x, float y, float speed, Direction direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 20, 20);
    }

    public void update(int delta) {
        if (direction == Direction.LEFT_TO_RIGHT) {
            this.x += (float) delta / this.speed;
            if (this.x > 800) {
                this.x = 0;
            }
        } else {
            this.x -= (float) delta / this.speed;
            if (this.x < 0) {
                this.x = 800;
            }
        }
    }
}
