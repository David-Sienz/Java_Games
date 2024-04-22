package at.david.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangles extends BasicGame {
    private float rectX;
    private float rectY;

    private float circleX;
    private float circleY;

    private float ovalX;
    private float ovalY;


    private float speed;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectX = 100;
        this.ovalX = 80;
        this.circleX = 45;

        this.speed = 10.0f;

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rectX += (float) delta/this.speed;
        this.rectY += (float) delta/this.speed;

        this.circleX += (float) delta/this.speed;

        this.ovalY += (float) delta/this.speed;

        if (this.rectX >= gameContainer.getWidth() || this.rectY >= gameContainer.getHeight()){
            this.speed *= -1.0f;
        }

        System.out.println(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.rectX,this.rectY,100,100);
        graphics.drawOval(this.ovalX, this.ovalY, 50, 90);
        graphics.drawOval(this.circleX, this.circleY, 70, 70);

        graphics.drawString("Hello World!",50,50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
