package cs.vsu.ruKorobeynikova_A_V;

import cs.vsu.ruKorobeynikova_A_V.backGround.DrawBackGround;
import cs.vsu.ruKorobeynikova_A_V.foreGround.DrawCopatuch;
import cs.vsu.ruKorobeynikova_A_V.foreGround.DrawDownThingAndHandWithAxe;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //рисуем задний фон
        DrawBackGround.drawShadow(g2, getWidth(), getHeight());

        //рисуем нижнюю непонятную штуку и руку с топором
        DrawDownThingAndHandWithAxe dr = new DrawDownThingAndHandWithAxe();
        dr.draw(g2, getWidth(), getHeight());

        //рисуем копатыча
        DrawCopatuch drawCopatuch = new DrawCopatuch();
        drawCopatuch.draw(g2, getWidth(), getHeight());


    }
}


