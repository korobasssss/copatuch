package cs.vsu.ruKorobeynikova_A_V.backGround;

import java.awt.*;

public class DrawBackGround {
    public void drawShadow(Graphics2D g2, int width, int height){
        g2.setColor(Color.gray);
        g2.fillOval(width / 3, height - 50, 2 * width / 3, 100);
    }
}
