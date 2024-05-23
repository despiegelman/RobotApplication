import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Arrays;
import java.util.List;
public class TheMagnusArchivesRobot{
    public static void main(String[]args) throws Exception{
        List<Integer> list = Arrays.asList(84, 72, 69, 32, 77, 65, 71, 78, 85, 83, 32, 65, 82, 67, 72, 73, 86, 69, 83, 10);
        Robot delia = new Robot();
        int x = 0;
        while (x < 10){
            delia.mouseMove(1710,30);
            delia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            delia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            for (int a = 0; a < 20; a++){
                delia.keyPress(list.get(a));
                delia.keyRelease(list.get(a));
            }
            delia.delay(500);
            x += 1;
        }
    }
}