import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    /**
     * @author Younes Karim & Benmessaoud Nadia & Ruimin Huang
     * // returns the current active orders and then sends you to the secondary stage
     **/
    public static void pizzaFinisher(ArrayList<Pizza> Display,ArrayList<Menu> pizza, ArrayList<String> stats) throws IOException {
        if (!Display.isEmpty()) {
                System.out.println("The following Active orders were found in the system.\n");
                for (Pizza value : Display) {
                if (value.isActive()) {
                    System.out.println("Order number: " + value.getOrderNumber() +
                            " | Pizza Nr: " + value.getPizzaNrOrdered() +
                            " | Ordered by: " + value.getCustomerName() +
                            " | Ordered on: " + value.getTime() +
                            " | Was ordered: " + value.isOnlineoroffline() +
                            "\n");
                } else {
                    Pizza.activity = false;
                }
            }
            secondStageFinisher(Display,pizza,stats);
        } else {
            System.out.println("\nSystem Error! [3]" +
                    "\nCan't finish a non existent order!\n");
        }
    }

    /**
     * @author Younes Karim
     * // secondary stage in which you have to input the ordernumber so that you can archive it
     **/
    public static void secondStageFinisher(ArrayList<Pizza> Display,ArrayList<Menu> pizza, ArrayList<String> stats) throws IOException {
        Scanner input = new Scanner(System.in);
        int orderNumber;
        do {
            System.out.println("Please input the Order number that you want to mark as finished... and hit enter!");
            orderNumber = input.nextInt();
            if (orderNumber < 1 || orderNumber > Display.size()) {
                System.out.println("System Error! [5]\nThe order number: "+orderNumber+" does not exist!\n");
            }
        } while (orderNumber < 1 || orderNumber > Display.size());
        if (Display.get(orderNumber - 1).isActive()) {
            Display.get(orderNumber - 1).setActive(false);
            Display.get(orderNumber - 1).setArchived(true);
            Files.setUsed();
            Files.writeArchive(Display, pizza, orderNumber - 1 ,Files.getLastUsed()+1);
            Files.writeSaleArchive(Display, pizza, orderNumber - 1 );
            Files.writeStatArchive(Display, pizza, orderNumber - 1 );
            System.out.println("\nOrder " + Display.get(orderNumber - 1).getOrderNumber() + " is now finished and archived in the system...\n");
        } else {
            System.out.println("This order is either already Completed & Archived or Invalid!\nTry typing another Order number\n");
        }
    }
}
