import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class Harvester implements Directions {

    public static void main (String[] args)
    {
        World.readWorld("worlds/fig3-2.kwld");
        World.setVisible(true);
        World.setDelay(75);
        //World.showSpeedControl(true);

        int row = 2;
        int col = 2;
        UrRobot bot = new UrRobot(3, 4,
                East, 1);
        bot.turnLeft();
        bot.move();
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.pickBeeper();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.move();
        bot.putBeeper();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnOff();
    }
}
