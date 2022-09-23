package cs.vsu.ruKorobeynikova_A_V;

import cs.vsu.ruKorobeynikova_A_V.backGround.DrawBackGround;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //draw background
        DrawBackGround.drawShadow(g2, getWidth(), getHeight());
    }
}


