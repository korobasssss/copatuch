package cs.vsu.ruKorobeynikova_A_V.foreGround;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

public class DrawDownThingAndHandWithAxe {
    Color c4 = new Color(104,81,67);

    private void drawDownThing(Graphics2D g2, int width, int height) {
        g2.setStroke(new BasicStroke(5F));

        GeneralPath gp = new GeneralPath();

        gp.moveTo(width / 1.75 + 70, height / 3 * 2 + 10);
        gp.curveTo(width / 1.75 + 70, height / 3 * 2 + 10, width / 1.75 + 160, height / 3 * 2 + 30, width / 1.75 + 60, height / 3 * 2 + 230);
        gp.lineTo(width / 1.75,height / 3 * 2 + 230);
        gp.curveTo(width / 1.75,height / 3 * 2 + 230, width / 1.75 + 70, height / 3 * 2 + 30, width / 1.75 - 15, height / 3 * 2 + 10);

        Color c1 = new Color(145, 125, 105);
        Color c2 = new Color(35, 17, 13);
        g2.setPaint(new LinearGradientPaint(0, 0, width, height,
                new float[]{0.6f, 0.9f},
                new Color[]{c1, c2}));
        g2.fill(gp);


        gp.moveTo(width / 2 - 80, height / 2 + 50);
        gp.curveTo(width / 2 - 80, height / 2 + 50, width / 2 - 100, height / 2 + 30, width / 2 - 120, height / 2 + 10);
        gp.curveTo(width / 2 - 120, height / 2 + 10, width / 2 - 100, height / 2 + 90, width / 2 - 60, height / 2 + 80);
        g2.setPaint(new LinearGradientPaint(0, 0, width, height,
                new float[]{0.6f, 0.9f},
                new Color[]{c1, c2}));
        g2.fill(gp);
        g2.setColor(c4);
        g2.draw(gp);
    }

    private void drawAxe(Graphics2D g2, int width, int height) {
        Color c = new Color(86, 67, 55);
        g2.setColor(c);

        AffineTransform old = g2.getTransform();
        g2.rotate(-0.4f, width / 2 - 165, height / 2 -70);
        g2.fillRect(width / 2 - 165, height / 2 -70, 13, 220);

        Color c1 = new Color(37, 17, 16);
        g2.setColor(c1);
        g2.fillOval(width / 2 - 170, height / 2 -75, 25, 25);

        GeneralPath gp = new GeneralPath();
        gp.moveTo(width / 2 - 160, height / 2 -65);
        gp.lineTo(width / 2 - 190, height / 2 -80);
        gp.lineTo(width / 2 - 190, height / 2 -40);
        gp.lineTo(width / 2 - 160, height / 2 -60);

        g2.fill(gp);
        g2.draw(gp);
        g2.setTransform(old);
    }

    public void draw(Graphics2D g2, int width, int height) {
        //кажись это дерево
        drawDownThing(g2, width, height);

        //топор
        drawAxe(g2, width, height);
    }
}
