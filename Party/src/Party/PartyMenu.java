package Party;

import java.util.Scanner;

/**
 * PartyMenu.java
 * Term 4 2018 Assignment 1 – This is the working class (main section)
 *
 * @author Claude DE-TCHAMBILA (217035027)
 * @author Harmony MOUSSOUNDI (218293992)
 * Date: 17 October 2018
 */
public class PartyMenu {


    public static void main(String[] args) {
        Party[] party = new Party[10];
        int size = 0;
        String choice = "";
        Scanner sc = new Scanner((System.in));

        // Adding 5 objects to the array
        party[0] = new DinnerParty(3, 100, "Parow", "Buff");
        party[1] = new DinnerParty(4, 120, "Stellenbosh", "Pizza");
        party[2] = new DinnerParty(6, 170, "Rondebosh", "Sit-down");
        party[3] = new KidsParty(8, 154, "Atlantis", "Superman", "Claude Chris");
        party[4] = new KidsParty(15, 121, "Kennilworth", "BlackPanther", "John Ramazani");

        size = 5;

        System.out.println(menu());
        System.out.print("Enter choice: ");
        choice = sc.nextLine();

        do {

            switch (choice) {
                case "1":
                    size = addParty(party, size);
                    break;
                case "2":
                    changeDinnerCostPerHead(party, size);
                    break;
                case "3":
                    displayInvites(party, size);
                    break;
                case "4":
                    showParty(party, size);
                    break;
                case "5":
                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            System.out.println(menu());
            System.out.print("Enter choice: ");
            choice = sc.nextLine();

        } while (!choice.equals("5"));

    }

    public static String menu() {
        return (
                "Menu\n" +
                        "1.Add party\n" +
                        "2.Change cost per head\n" +
                        "3.Display invitation\n" +
                        "4.Show party\n" +
                        "5.Exit"
        );

    }

    public static int addParty(Party[] p, int size) {
        String option;
        int numberOfGuests;
        double costPerHead;
        String address;

        String dinnerChoice; // only for DinnerParty

        /* only for kidsParty*/
        String theme;
        String supervisor;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1 for Dinner party and 2 for kids party: ");
        option = scan.nextLine();

        if (option.equals("1")) {
            System.out.print("Enter numberOfGuests: ");
            numberOfGuests = scan.nextInt();
            System.out.print("Enter cost per head: ");
            costPerHead = scan.nextDouble();
            scan.nextLine();
            System.out.print("Enter address: ");
            address = scan.nextLine();
            System.out.print("Enter dinner choice: ");
            dinnerChoice = scan.nextLine();

            p[size] = new DinnerParty(numberOfGuests, costPerHead, address, dinnerChoice);
            size++;

        } else if (option.equals("2")) {
            System.out.print("Enter numberOfGuests: ");
            numberOfGuests = scan.nextInt();
            System.out.print("Enter cost per head: ");
            costPerHead = scan.nextDouble();
            scan.nextLine();
            System.out.print("Enter address: ");
            address = scan.nextLine();
            System.out.print("Enter theme: ");
            theme = scan.nextLine();
            System.out.print("Enter supervisor: ");
            supervisor = scan.nextLine();

            p[size] = new KidsParty(numberOfGuests, costPerHead, address, theme, supervisor);
            size++;

        }
        return size;
    }

    public static void showParty(Party[] p, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(p[i].toString());
        }
    }

    public static void displayInvites(Party[] p, int size) {
        for (int j = 0; j < size; j++) {
            System.out.println(p[j].displayInvitation() + "\n");
        }
    }

    public static void changeDinnerCostPerHead(Party[] p, int size) {
        String dinnerChoice;
        double increaseCost;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dinner choice: ");
        dinnerChoice = sc.next();

        for (Party p1 : p
        ) {
            if (p1 instanceof DinnerParty) {
                if (dinnerChoice.equalsIgnoreCase(((DinnerParty) p1).getDinnerChoice())) {
                    System.out.print("Enter increase cost: ");
                    increaseCost = sc.nextDouble();
                    p1.costPerHead += increaseCost;
                }
            }
        }
    }

}
