import java.util.Random;
import java.util.Timer;

public class World {
    // variabler
    private Random random = new Random();
    private boolean downpour;
    private int day;

    // konstruktør - dag variabel angis når verden opprettes, vær genereres automatisk
    public World(int day) {
        this.day = day;
        this.downpour = random.nextBoolean(); // automatisk vær-generering
    }

    //get/set?
    public boolean getDownpour() {
        return downpour;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    // er det helg?
    public boolean isWeekend(){
        if(day % 7 == 0 || day % 7 == 6){
            // System.out.println("Det er helg");
            return true; // det er helg
        } else {
            // System.out.println("Det er ukedag");
            return false; // det er ukedag
        }
    }
}
