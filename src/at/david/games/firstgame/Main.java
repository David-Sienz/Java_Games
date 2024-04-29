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

    private boolean ovalMovingRight = true;
    private boolean circleMovingUp = true;

    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        rectX = 100;
        rectY = 100;
        ovalX = 100;
        ovalY = 100;
        circleX = 100;
        circleY = 100;

        speed = 0.5f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        //Rectangle
        if (rectX < 500 && rectY == 100) {
            rectX += speed;
        } else if (rectX >= 500 && rectY < 400) {
            rectY += speed;
        } else if (rectX > 100) {
            rectX -= speed;
        } else if (rectY > 100) {
            rectY -= speed;
        }

        // Circle
        if (circleMovingUp) {
            circleY -= speed;
        } else {
            circleY += speed;
        }

        if (circleY <= 0 || circleY >= 530) {
            circleMovingUp = !circleMovingUp;
        }

        // Oval
        if (ovalMovingRight) {
            ovalX += speed;
        } else {
            ovalX -= speed;
        }

        if (ovalX >= 400 || ovalX <= 0) {
            ovalMovingRight = !ovalMovingRight;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(rectX, rectY, 100, 100);
        graphics.drawOval(ovalX, ovalY, 50, 90);
        graphics.drawOval(circleX, circleY, 70, 70);
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
