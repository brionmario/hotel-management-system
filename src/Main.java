import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Brion Mario on 14/07/2016.
 */
public class Main {

    public static void main(String[] args){
        //Creating an object of Procedures class
        Procedures  procedures = new Procedures();
        //Creating a que object
        Queue queue = new Queue();

        //Creating an object of Room class
        Room room = new Room();

        //Creating a que object
        Queue myQueue = new Queue();

        //variable for the menu choice
        String menuItem;

        System.out.println("\t█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█");
        System.out.println("\t█░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░█");
        System.out.println("\t█░░║║║╠─║─║─║║║║║╠─░░█");
        System.out.println("\t█░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░█");
        System.out.println("\t█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█");
        System.out.println("");
        System.out.println("\t             TO THE HOTEL             ");
        System.out.println("\t         W E S T M I N S T E R        ");
        System.out.println("\t           Management  System         \n");

        //creating a scanner for input
        Scanner sc = new Scanner(System.in);

        //creating an array of rooms using the room class
        Room[] hotel = new Room[10];

        //creating 10 objects of room class
        for(int x=0;x<hotel.length;x++){
            hotel[x]=new Room();
        }

    //Creating a menu
    do{

            System.out.println("V : View all rooms");
            System.out.println("A : Add a customer to a room");
            System.out.println("E : Display Empty rooms");
            System.out.println("D : Delete a customer from a room");
            System.out.println("F : Find room from Customer's name");
            System.out.println("S : Write Customer information into a text file");
            System.out.println("L : Load Customer information from a text file");
            System.out.println("O : View rooms ordered alphabetically by name");
            System.out.println("3 : Display the names of the first 3 customers who have been allocated to a room.");
            System.out.println("Q : Quit");

            System.out.println("\nPlease Enter your choice : ");

            menuItem = sc.next().toUpperCase();

            // Switch for the Menu
            switch (menuItem) {
                case "V":
                    procedures.viewRooms(hotel);
                    break;
                case "A":
                    procedures.addCustomer(hotel,room);
                    break;
                case "E":
                    procedures.displayEmptyRooms(hotel);
                    break;
                case "D":
                    procedures.deleteCustomer(hotel);
                    break;
                case "F":
                    procedures.findCustomerRoom(hotel);
                    break;
                case "S":
                    procedures.fileWriting(hotel,room);
                    break;
                case "L":
                    procedures.fileReading(hotel);
                    break;
                case "O":
                    procedures.sortByName(hotel);
                    break;
                case "3":
                    queue.displayqueue();
                    break;
                case "Q":
                    procedures.exitProgram();
                    break;
                default:
                    //Error message for invalid inputs
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }while (!(menuItem.equalsIgnoreCase("q")));
    }

}
