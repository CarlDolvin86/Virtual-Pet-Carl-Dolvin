import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        //Greet user and instantiate and display myVirtualPet status.
        System.out.println("Welcome to Java Pet");
        System.out.print("What do you want to call your otter? ");
        String petName = input.nextLine();
        VirtualPet myVirtualPet = new VirtualPet(25, 25, 45);
        System.out.println(petName + " The Otter ");
        System.out.println(" ");
        System.out.println("  .-\"\"\"-.\n" +
                " /      o\\\n" +
                "|    o   0).-.\n" +
                "|       .-;(_/     .-.\n" +
                " \\     /  /)).---._|  `\\   ,\n" +
                "  '.  '  /((       `'-./ _/|\n" +
                "    \\  .'  )        .-.;`  /\n" +
                "     '.             |  `\\-'\n" +
                "       '._        -'    /\n" +
                "          ``\"\"--`------`");
        System.out.println(" ");
        System.out.println("hunger: " + myVirtualPet.getHunger() + "\n" + "thirst: " + myVirtualPet.getThirst() + "\n"
                + "waste: " + myVirtualPet.getWaste());
        //runs game loop as long as myVirtualPet is alive
        while (!myVirtualPet.getStatus()) {
            //user choices for pet action
            System.out.println("What do you want to do? ");
            System.out.println("1. Feed " + petName);
            System.out.println("2. Give water to " + petName);
            System.out.println("3. Take " + petName + " to bathroom ");
            System.out.println("4. " + petName + " will do nothing ");
            choice = input.nextInt();
            if (choice == 1) {
                myVirtualPet.feed();
            } else if (choice == 2) {
                myVirtualPet.drink();
            } else if (choice == 3) {
                myVirtualPet.relieve();
            } else if (choice == 4) {
                myVirtualPet.doNothing();
            } else {
                System.out.println("Invalid response, Please try again");
                //choice = input.nextInt();
            }
            System.out.println("Hunger: " + myVirtualPet.getHunger() + "\n" + "Thirst: " + myVirtualPet.getThirst()
                    + "\n" + "Waste: " + myVirtualPet.getWaste());
            System.out.println("\n time passed " + myVirtualPet.getTimePassed());
            //System.out.println("\n ");
        }
        System.out.println("\n" + petName + " is dead!");
    }
}