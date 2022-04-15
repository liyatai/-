

import javax.swing.*;
import java.awt.*;

public class Backgoundpanel extends JPanel {
    private Image backIcon;

    public Backgoundpanel(Image backIcon) {
        this.backIcon = backIcon;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent( g);
        g.drawImage(backIcon,0,0,this.getWidth(),this.getHeight(),null);

    }
}
