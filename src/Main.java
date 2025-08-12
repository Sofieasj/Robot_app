import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        World world = new World(15);
        Robot robot = new Robot("C32PE");
        Controller controller = new Controller();

        controller.hello(robot);
        controller.play(robot,world);
    }
}
