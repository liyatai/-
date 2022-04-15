

import java.awt.*;

public class ScreenTool {
    public static int getScreenWidth(){
        return Toolkit.getDefaultToolkit().getScreenSize().width;
    }
    public static int getScreenHeight(){
        return Toolkit.getDefaultToolkit().getScreenSize().height;
    }
}
