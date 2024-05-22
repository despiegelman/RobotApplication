import java.awt.*;
import java.awt.event.InputEvent;
public class ApplicationRobot{
    public static void main(String[]args) throws Exception{
        Robot delia = new Robot();
        delia.mouseMove(1500,100);
        delia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        int x = 0;
        while (x < 1000){
            delia.keyPress(32);
        }
    }
}