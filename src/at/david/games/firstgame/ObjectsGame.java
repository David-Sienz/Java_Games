package at.david.games.firstgame;

import org.newdawn.slick.*;

public class ObjectsGame extends BasicGame {
    private Rectangle rectangle;
    private Rectangle rectangle2;
    private Rectangle rectangle3;
    private Rectangle rectangle4;
    private Rectangle rectangle5;
    private Rectangle rectangle6;
    private Rectangle rectangle7;
    private Rectangle rectangle8;
    private Rectangle rectangle9;
    private Rectangle rectangle10;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangle(100,50,5);
        this.rectangle2 = new Rectangle(200,100,10);
        this.rectangle3 = new Rectangle(250,150,11);
        this.rectangle4 = new Rectangle(250,250,10);
        this.rectangle5 = new Rectangle(350,300,12);
        this.rectangle6 = new Rectangle(300,350,10);
        this.rectangle7 = new Rectangle(350,400,9);
        this.rectangle8 = new Rectangle(400,450,10);
        this.rectangle9 = new Rectangle(400,500,8);
        this.rectangle10 = new Rectangle(450,550,6);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rectangle.update(delta);
        this.rectangle2.update(delta);
        this.rectangle3.update(delta);
        this.rectangle4.update(delta);
        this.rectangle5.update(delta);
        this.rectangle6.update(delta);
        this.rectangle7.update(delta);
        this.rectangle8.update(delta);
        this.rectangle9.update(delta);
        this.rectangle10.update(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rectangle.render(graphics);
        this.rectangle2.render(graphics);
        this.rectangle3.render(graphics);
        this.rectangle4.render(graphics);
        this.rectangle5.render(graphics);
        this.rectangle6.render(graphics);
        this.rectangle7.render(graphics);
        this.rectangle8.render(graphics);
        this.rectangle9.render(graphics);
        this.rectangle10.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Objects Movement"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
