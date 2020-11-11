import java.util.ArrayList;
import java.util.Scanner;

public class Pizza{
    private int orderNumber;
    private int pizzaNrOrdered;
    private String customerName;
    private String orderTime;
    private final boolean onlineoroffline;
    private boolean active;
    private boolean archived;
    public static boolean activity;

    //pizza constructor
    public Pizza(int orderNumber, int pizzaNrOrdered, String customerName, boolean onlineoroffline, boolean archived, boolean active, String orderTime) {
        this.orderNumber = orderNumber;
        this.pizzaNrOrdered = pizzaNrOrdered;
        this.customerName = customerName;
        this.onlineoroffline = onlineoroffline;
        this.active = active;
        this.orderTime = orderTime;
        this.archived = archived;
    }

    /**
     * @author Younes Karim & Benmessaoud Nadia & Ruimin Huang
     * // create pizza orders by different inputs so that you later on can finish them
     **/
    public static void makePizza(ArrayList<Pizza> makepizza) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the Name of the Customer... and hit enter");
        String customerName = input.nextLine();
        int pizzaNum;
        do {
            System.out.println("Please input the Pizza Number the Customer wants to order... and hit enter");
            pizzaNum = input.nextInt();
            if (pizzaNum < 1 || pizzaNum > 15) {
               System.out.println("System Error [1] \nThis pizza does not exist!\n");
            }
        } while (pizzaNum < 1 || pizzaNum > 15);
        System.out.println("Please input if the order is online or in store... and hit enter");
        String pattern = "store";
        boolean online;
        online = !input.hasNext(pattern);
        makepizza.add(new Pizza(makepizza.size()+1, pizzaNum, customerName, online, false, true, Count.getdate()));
        activity = true;
    }

    /**
     * @author Younes Karim
     * // create pizza orders
     **/
    public static void createPizza(ArrayList<Pizza> showOrders) {
        makePizza(showOrders);
        System.out.println("The system was updated with the order " +
                "\nThe System now contains: "+showOrders.size()+" new orders in total" +
                "\n");
    }

    /**
     * @author Younes Karim
     * // if there are active orders in the system we display them here so that mario can see them
     **/
    public static void pizzaOrders(ArrayList<Pizza> Display, ArrayList<Menu> pizzaMenu) {
        if (!Display.isEmpty() && activity) {
            System.out.println("The following active orders were found in the system\n");
            for (Pizza pizza : Display) {
                if (pizza.isActive()) {
                    System.out.println("Order number: " + pizza.getOrderNumber() +
                            " | Pizza Nr: " + pizza.getPizzaNrOrdered() +
                            " | Person ordering is: " + pizza.getCustomerName() +
                           // " | Pizza active? " + pizza.isActive()
                            " | Order created on: " + pizza.getTime() +
                            " | Pizza Named: " + pizzaMenu.get(pizza.getPizzaNrOrdered()-1).getPizzaName() +
                            " | Pizza Price: " + pizzaMenu.get(pizza.getPizzaNrOrdered()-1).getPizzaPrice() +
                            " | Ordered: " + pizza.isOnlineoroffline() + "\n");
                }
            }
        } else {
            System.out.println("\nSystem Error! [2]"+"\nThere are no orders in the system!\n");
            activity = false;
        }
    }

    /**
     * @author Younes Karim & Benmessaoud Nadia & Ruimin Huang
     * // a small setter for the location of order
     **/
    public String isOnlineoroffline () {
        String online = "On the phone";
        String offline = "In the store";
        if (onlineoroffline) {
            return online;
        } else {
            return offline;
        }
    }

    public int getOrderNumber() {
        return orderNumber;
    }
    public int getPizzaNrOrdered() {
        return pizzaNrOrdered;
    }
    public String getCustomerName() {
        return customerName;
    }
    public boolean isActive() {
        return active;
    }
    public boolean isArchived() {
        return archived;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    public void setPizzaNrOrdered(int pizzaNrOrdered) {
        this.pizzaNrOrdered = pizzaNrOrdered;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public void setArchived(boolean archived) {
        this.archived = archived;
    }
    public String getTime() {
        return orderTime;
    }
    public void setTime(String orderTime) {
        this.orderTime = Count.getdate();
    }
}