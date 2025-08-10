public class Robot {
    //variabler
    private String model;
    private String name;
    private int battery = 100;

    //konstruktør - nb batteri skal automatisk starte på 100
    public Robot(String model) {
        this.model = model;
    }

    // get og set
    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public int getBattery() {
        return battery;
    }

    // set - endre navn
    public void setName(String name) {
        this.name = name;
    }

    public void setBattery(int battery) {
        if (battery <= 100 && battery >= 0) { //logikk - så batteri % kun kan være 0-100 og ikke fx 130
            this.battery = battery;
        }
    }

    // ACTIVITY
    // gå til parken - opphold og min 40% batteri
    public boolean goToPark (World world){
        if(world.getDownpour()) {
            System.out.println("Det regner, vi får finne på noe annet og dra i parken senere istedenfor.");
            return false;
        }
        else if(this.battery < 40) {
            System.out.println("Det er ikke nok batteri til å gå til parken. På tide å lade :)");
            return false;
        }
        else {
            //juster batteri dersom aktiviteten gjennomføres
            this.setBattery(this.battery - 30);
            System.out.println("Parken, here I come! Oppdatert batterinivå: " + this.battery);
            return true;
        }
    }

    // gå på disco - helg og minst 50% batteri
    public boolean goToDisco (World world){
        if(!world.isWeekend()) {
            System.out.println("Det er ukedag, ingen disco i dag");
            return false;
        } else if (this.battery < 50){
            System.out.println("Det er ikke nok batteri, jeg trenger minst 50%");
            return false;
        } else {
            //juster batteri dersom aktiviteten gjennomføres
            this.setBattery(this.battery - 40);
            System.out.println("Disco, here I come! Oppdatert batterinivå: " + this.battery);
            return true;
        }
    }

    // gå på kattekafé - helg
    public boolean goToCatCafe (World world){
        if(!world.isWeekend()) {
            System.out.println("Det er ukedag, ingen cafe i dag");
            return false;
        } else {
            //juster batteri dersom aktiviteten gjennomføres - +
            this.setBattery(this.battery + 30);
            System.out.println("Klar til kattekafé! Oppdatert batterinivå: " + this.battery);
            return true;
        }
    }

    // lade - batteri max 30%
    public boolean chargeBattery() {
        if (battery < 30) {
            System.out.println("Det er lite batteri, på tide å lade! Zzzz .. på vei til 100%");
            this.setBattery(100);
            return true;
        } else {
            System.out.println("Vi trenger ikke lade enda. Batteri nivå: " + this.battery);
            return false;
        }
    }
}
