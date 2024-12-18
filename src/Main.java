import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int money = 1000;

        System.out.println("Hello! Welcome to the salon.");
        System.out.println("Do you have a VIP membership with us? Our bes clients always get a discount.");
        Scanner name = new Scanner(System.in);
        System.out.print("y/n: ");
        String VIP = name.nextLine();

        System.out.println("What type of event with you be attending? This affects what products you may receive.");
        Scanner occasion = new Scanner(System.in);
        System.out.print("Type 'C' for Casual \nType 'B' for Business Formal \nType 'O' for Outdoor Party ");
        String event_type = occasion.nextLine();



    }
}