// SimEx17a.java
// Color sensor, polling

import ch.aplu.robotsim.*;

public class SimEx17a
{
  public SimEx17a()
  {
    LegoRobot robot = new LegoRobot();
    Gear gear = new Gear();
    ColorSensor cs = new ColorSensor(SensorPort.S1);
    robot.addPart(gear);
    robot.addPart(cs);
    gear.setSpeed(10);
    gear.forward();
    int n = 0;
    while (true)
    {
      n++;
      RobotContext.setStatusText("Measure # " + n
        + ": Intensity: " + cs.getLightValue()
        + " Color: " + cs.getColor());
      Tools.delay(500);
    }
  }

  public static void main(String[] args)
  {
    new SimEx17a();
  }

  // ------------------ Environment --------------------------
  static
  {
    RobotContext.setStartPosition(250, 300);
    RobotContext.setStartDirection(-90);
    RobotContext.useBackground("sprites/colorbar.gif");
    RobotContext.showStatusBar(20);
  }
}
