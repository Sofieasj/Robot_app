public class Main {
    public static void main(String[] args){

        World w1 = new World(13);
        Robot r1 = new Robot("123435", "Wall-E");

        System.out.println(w1.getDownpour());

        r1.goToPark(w1);
        r1.goToDisco(w1);
        r1.goToCatCafe(w1);
        r1.goToPark(w1);
        r1.chargeBattery();

    }
}
