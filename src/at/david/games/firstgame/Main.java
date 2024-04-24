package at.david.games.firstgame;

import org.newdawn.slick.*;

public class Main extends BasicGame {

    private float rectX;
    private float rectY;

    private float circleX;
    private float circleY;

    private float ovalX;
    private float ovalY;

    private float speed;


    public enum Direction { RIGHT, LEFT, UP, DOWN }

    private Direction rectDirection;
    private Direction circleDirection;
    private Direction ovalDirection;

    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        rectX = 100;
        rectY = 100;
        ovalX = 80;
        ovalY = 80;
        circleX = 45;
        circleY = 45;

        speed = 0.5f;


    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        //rectangle: direction
        if(rectDirection == Direction.RIGHT) {
            rectX += speed;
        }
        if(rectDirection == Direction.LEFT) {
            rectX -= speed;
        }
        if(rectDirection == Direction.UP) {
            rectX -= speed;
        }
        if(rectDirection == Direction.DOWN) {
            rectY += speed;
        }

        //rectangle: movement
        if (rectX >= 0 && rectX < 500 && rectY < 400) {
            rectDirection = Direction.RIGHT;
        } else if (rectX >= 500 && rectY < 400) {
            rectDirection = Direction.DOWN;
        } else if (rectY >= 400 && rectX > 0) {
            rectDirection = Direction.LEFT;
        } else if (rectX <= 0 && rectY > 0) {
            rectDirection = Direction.UP;
        }



        //circle: direction
        if(circleDirection == Direction.UP) {
            circleY += speed;
        }
        if(circleDirection == Direction.DOWN) {
            circleY -= speed;
        }

        //circle: movement
        if(circleY>=0) {
            circleDirection = Direction.DOWN;
        } if (circleY <= 500) {
            circleDirection = Direction.UP;
        }

        //oval: direction
        if(ovalDirection == Direction.RIGHT) {
            ovalX += speed;
        }
        if(ovalDirection == Direction.LEFT) {
            ovalX -= speed;
        }

        //oval: movement
        if(ovalX >= 0) {
            ovalDirection = Direction.RIGHT;
        }

        if(ovalX == 500) {
            ovalDirection = Direction.LEFT;
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(rectX, rectY, 100, 100);
        graphics.drawOval(ovalX, ovalY, 50, 90);
        graphics.drawOval(circleX, circleY, 70, 70);

        graphics.drawString("Hello World!", 50, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Main("Objects Movement"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
