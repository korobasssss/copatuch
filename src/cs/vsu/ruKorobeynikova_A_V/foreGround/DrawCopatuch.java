package cs.vsu.ruKorobeynikova_A_V.foreGround;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

public class DrawCopatuch {
    private final Color color = new Color(150, 122, 100);
    Color c = new Color(171, 141, 117);

    private void drawBodyAndEars(Graphics2D g2, int width, int height) {
        g2.setColor(c);
        //уши
        AffineTransform old = g2.getTransform();
        g2.rotate(-0.3f, width / 2 - 40, height / 3 - 5);
        g2.fillArc(width / 2 - 40, height / 3 - 5, 40, 70, 10, 360);

        g2.setColor(color);

        g2.drawArc(width / 2 - 40, height / 3 - 5, 40, 70, 10, 360);
        g2.setTransform(old);

        g2.setColor(c);

        g2.rotate(0.3f, width / 1.5, height / 3 - 12);
        g2.fillArc((int) (width / 1.5), height / 3 - 12, 40, 70, -30, 360);

        g2.setColor(color);

        g2.drawArc((int) (width / 1.5), height / 3 - 12, 40, 70, -30, 360);
        g2.setTransform(old);

        g2.setColor(c);
        //тело
        g2.fillOval((int) (width / 2.5), height / 3, 270, 300);

        g2.setColor(color);

        g2.drawOval((int) (width / 2.5), height / 3, 270, 300);
    }

    private void drawEyesAndBrows(Graphics2D g2, int width, int height) {
        //глаза
        g2.setColor(Color.white);
        g2.fillOval(width / 2 - 30, height / 3 + 60, 60, 75);
        g2.fillOval(width / 2 + 30, height / 3 + 60, 60, 75);

        g2.setColor(color);
        g2.drawOval(width / 2 - 30, height / 3 + 60, 60, 75);
        g2.drawOval(width / 2 + 30, height / 3 + 58, 60, 75);

        //зрачки
        g2.setColor(Color.black);
        AffineTransform old = g2.getTransform();
        g2.rotate(-0.3, width / 2 - 20, height / 3 + 60);
        g2.fillOval(width / 2 - 13, height / 3 + 95, 15, 25);

        g2.setTransform(old);

        g2.rotate(0.3, width / 2 + 60, height / 3 + 90);
        g2.fillOval(width / 2 + 51, height / 3 + 90, 15, 25);
        g2.setTransform(old);

        //брови
        Color c1 = new Color(37, 17, 16);
        g2.setColor(c1);
        g2.rotate(-0.7f, width / 2 + 45, height / 3 + 75);
        g2.fillRect(width / 2 + 35, height / 3 + 60, 55, 15);
        g2.setTransform(old);

        g2.rotate(0.7f, width / 2 - 10, height / 3 + 35);
        g2.fillRect(width / 2 - 10, height / 3 + 35, 55, 15);
        g2.setTransform(old);
    }

    private void drawCheeksAndNoseAndMouse(Graphics2D g2, int width, int height) {
        //нос
        Color c2 = new Color(57, 36, 33);
        Color c1 = new Color(37, 17, 16);
        g2.setColor(c2);

        g2.fillOval(width / 2, height / 3 + 110, 60, 40);

        g2.setColor(c1);

        g2.drawOval(width / 2, height / 3 + 110, 60, 40);

        //рот
        Color c3 = new Color (117, 94, 80);
        Color c4 = new Color(104,81,67);
        g2.setColor(c3);
        GeneralPath gp = new GeneralPath();

        gp.moveTo(width / 2 + 3, height / 3 + 160);
        gp.curveTo(width / 2 + 5, height / 3 + 160, width / 2 + 30, height / 3 + 180, width / 2 + 59, height / 3 + 160);
        gp.curveTo(width / 2 + 59, height / 3 + 160, width / 2 + 50, height / 3 + 170, width / 2 + 42, height / 3 + 179);
        gp.curveTo(width / 2 + 42, height / 3 + 179, width / 2 + 32, height / 3 + 183, width / 2 + 19, height / 3 + 179);
        gp.curveTo(width / 2 + 19, height / 3 + 179, width / 2 + 10, height / 3 + 170, width / 2 + 3, height / 3 + 160);

        g2.fill(gp);

        g2.setColor(c4);
        g2.draw(gp);

        //щеки
        g2.setColor(c);
        AffineTransform old = g2.getTransform();

        g2.rotate(0.9f, width / 2 - 32, height / 3 + 105);
        g2.fillArc(width / 2 - 32, height / 3 + 105, 75, 70, 0, 360);

        g2.setColor(color);
        g2.drawArc(width / 2 - 32, height / 3 + 105, 75, 70, 0, 180);

        g2.setTransform(old);

        g2.setColor(c);

        g2.rotate(-0.9f, width / 2 + 47, height / 3 + 162);
        g2.fillArc(width / 2 + 47, height / 3 + 162, 75, 70, 0, 360);

        g2.setColor(color);
        g2.drawArc(width / 2 + 47, height / 3 + 162, 75, 70, 0, 180);

        g2.setTransform(old);
    }

    public void draw(Graphics2D g2, int width, int height) {
        //рисуем тело и уши
        drawBodyAndEars(g2, width, height);

        //рисуем глаза и брови
        drawEyesAndBrows(g2, width, height);

        //рисуем нос, щеки, рот
        drawCheeksAndNoseAndMouse(g2, width, height);
    }
}
