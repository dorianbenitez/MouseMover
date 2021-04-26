import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseMove {

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        while (true) {
            Thread.sleep(45000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }
    }
}
