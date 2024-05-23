import java.awt.*;
import java.awt.event.InputEvent;
public class SpaceClickerRobot{
    public static void main(String[]args) throws Exception{
        Robot delia = new Robot();
        delia.mouseMove(1500,430);
        delia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        delia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        int x = 0;
        while (x < 1000){
            delia.keyPress(32);
            delia.keyRelease(32);
            x += 1;
        }
    }
}