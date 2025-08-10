import java.util.Scanner;

public class Controller {
    Scanner s = new Scanner(System.in);
    String in = "";

    public void hello(Robot robot){
        System.out.println("Hello! I am an " + robot.getModel() + " robot. Can you give me a name?");
        robot.setName(in = s.nextLine()); // set new name via terminal
        System.out.println("Thank you! " + robot.getName() + " is a great name - I love it!");
        System.out.println("What is your name?");
        String user = s.nextLine(); //users mame
        System.out.println("It's nice to meet you, " + user + "! Are you ready for a fun day together?");
    }

    public void play(Robot robot, World world){
        do {
            System.out.println("");
            System.out.println("What should we do?");

            //delay / added space
            System.out.println("");

            System.out.println("1) Go to the park -30% battery");
            System.out.println("2) Go dancing at the disco -40% battery");
            System.out.println("3) Go to a cat cafe +30% battery");
            System.out.println("4) Go to sleep (fully charge)");
            System.out.println("5) Quit");

            //added space
            System.out.println("");

            in = s.nextLine();

            switch (in) {
                case "1":
                    robot.goToPark(world);
                    //delay
                    break;
                case "2":
                    robot.goToDisco(world);
                    break;
                case "3":
                    robot.goToCatCafe(world);
                    break;
                case "4":
                    robot.chargeBattery();
                    break;
                case "5":
                    System.out.println("Bye bye, see you again!");
                    break;
                default:
                    System.out.println("Ooops, not a valid response. " +
                            "Choose a number between 1-5 to choose what to do");
                    break;
            }
        } while (!in.equals("5"));
    }
}
