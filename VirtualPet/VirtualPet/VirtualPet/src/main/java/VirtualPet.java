public class VirtualPet {
    private int hunger;
    private int thirst;
    private int waste;
    private int timePassed;
    private boolean isDead;

    //constructor for Virtual Pet. Takes in 3 variables
    public VirtualPet(int inHunger, int inThirst, int inWaste) {
        hunger = inHunger;
        thirst = inThirst;
        waste = inWaste;
        timePassed = 0;
        isDead = false;
    }

    //checks if hunger is less than 50
    public boolean isHungry() {
        return hunger <= 0;
    }

    //checks if thirst is less than 50
    public boolean isThirsty() {
        return thirst <= 0;
    }

    //checks if waste is greater than 50
    public boolean needToWaste() {
        return waste >= 60;
    }

    // tracks passage of time based on action
    public void tick() {
        timePassed++;
        if (needToWaste()) {
            relieve();
        } else if (hunger >= 100 || thirst >= 100) {
            isDead = true;
        } else if (timePassed > 20) {
            isDead = true;
        }
    }

    public boolean getStatus() {
        return isDead;
    }

    //return time passage of time value
    public int getTimePassed() {
        return timePassed;
    }

    //return hunger value
    public int getHunger() {
        return hunger;
    }

    //return thirst value
    public int getThirst() {
        return thirst;
    }

    //return waste value
    public int getWaste() {
        return waste;
    }

    //decrease hunger and increase need to use the bathroom
    public void feed() {
        System.out.println("// \"\"--.._\n" +
                "||  (_)  _ \"-._\n" +
                "||    _ (_)    '-.\n" +
                "||   (_)   __..-'\n" +
                " \\\\__..--\"\"");
        System.out.println(" ");
        System.out.println("Do otters eat that? ");
        hunger -= 20;
        if (isHungry()) {
            hunger = 0;
            System.out.println("\nPlease no more pizza...please..!\n");
        } else {
            waste += 30;
            thirst += 10;
            timePassed++;
            tick();
        }
        //tired -= 10;
    }

    //decrease thirst and increase need to use the bathroom
    public void drink() {
        System.out.println("  .\n" +
                "  .\n" +
                " . .\n" +
                "  ...\n" +
                "\\~~~~~/\n" +
                " \\   /\n" +
                "  \\ /\n" +
                "   V\n" +
                "   |\n" +
                "   |\n" +
                "  ---");
        System.out.println(" ");
        System.out.println("Guess that's one way to hydrate. ");
        thirst -= 30;
        if (isThirsty()) {
            thirst = 0;
            System.out.println("\nI'm good! I don't need anything else to drink.\n");
        } else {
            waste += 20;
            hunger += 10;
            timePassed++;
            tick();
        }
        //tired -= 8;
    }

    //decrease need to use the bathroom
    //pee or poop
    public void relieve() {
        System.out.println(" _____ _____  ______ _____ _____ \n" +
                "|  __ \\  _  | | ___ \\  ___|  ___|\n" +
                "| |  \\/ | | | | |_/ / |__ | |__  \n" +
                "| | __| | | | |  __/|  __||  __| \n" +
                "| |_\\ \\ \\_/ / | |   | |___| |___ \n" +
                " \\____/\\___/  \\_|   \\____/\\____/ \n" +
                "                                 ");
        System.out.println(" ");
        waste -= waste;
        hunger += 5;
        thirst += 5;
        tick();
        //tired -= 10;
    }

    //do nothing
    public void doNothing() {
        System.out.println(".'`~~~~~~~~~~~`'.\n" +
                "(  .'11 12 1'.  )\n" +
                "|  :10 \\    2:  |\n" +
                "|  :9   @-> 3:  |\n" +
                "|  :8       4;  |\n" +
                "'. '..7 6 5..' .'\n" +
                " ~-------------~  ldb\n");
        hunger++;
        thirst++;
        waste++;
        tick();
    }

}