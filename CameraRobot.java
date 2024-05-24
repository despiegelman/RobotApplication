import java.awt.*;
import java.awt.event.InputEvent;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File; 

public class CameraRobot{
    public static void main(String[]args) throws Exception{
        Robot delia = new Robot();
        delia.mouseMove(10,1064);
        delia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        delia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        delia.mouseMove(137,886);
        delia.delay(500);
        delia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        delia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        delia.mouseMove(1176,523);
        delia.delay(2500);
        delia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        delia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        delia.mouseMove(1187,917);
        delia.delay(250);
        delia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        delia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        delia.mouseMove(726,84);
        delia.delay(250);
        delia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        delia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        delia.mouseMove(722,194);
        delia.delay(500);
        delia.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        delia.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle bounds = new Rectangle(screenSize);
        BufferedImage image= delia.createScreenCapture(bounds); 
        File file = new File("myScreenShot.png");
        ImageIO.write(image,"png", file);
        System.out.println("A screenshot is captured to " + file.getPath()); 

    }
}
