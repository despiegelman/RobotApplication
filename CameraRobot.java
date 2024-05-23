import java.awt.*;
import java.awt.event.InputEvent;
public class CameraRobot{
    public static void main(String[]args) throws Exception{
        Robot delia = new Robot();
        delia.delay(500);
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        System.out.print(b.getX() + "," + b.getY());
    }
}
