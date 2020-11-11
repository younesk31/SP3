import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int pizzaNr;
    private String pizzaName;
    private String pizzaFilling;
    private int pizzaPrice;

    public Menu(int pizzaNr, String pizzaName, String pizzaFilling, int pizzaPrice) {
        this.pizzaNr = pizzaNr;
        this.pizzaName = pizzaName;
        this.pizzaFilling = pizzaFilling;
        this.pizzaPrice = pizzaPrice;
    }

    /**
     * @author Younes Karim & Ruimin Huang
     * // Welcome page
     **/
    public static void startPage() {

        System.out.println(
        "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n" +
        "██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\n" +
        "█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░███░░░░░░░░░░█░░░░░░░░░░░░░░████░░░░░░░░░░░░░░█░░░░░░░░░░█░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█\n" +
        "█░░▄▀░░░░░░░░░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀░░███░░▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░████░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█\n" +
        "█░░▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░░░▄▀░░███░░░░▄▀░░░░█░░▄▀░░░░░░▄▀░░████░░▄▀░░░░░░▄▀░░█░░░░▄▀░░░░█░░░░░░░░░░░░▄▀▄▀░░█░░░░░░░░░░░░▄▀▄▀░░█░░▄▀░░░░░░▄▀░░█\n" +
        "█░░▄▀░░░░░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░████░░▄▀░░█████░░▄▀░░███░░▄▀░░██░░▄▀░░████░░▄▀░░██░░▄▀░░███░░▄▀░░███████████░░░░▄▀░░░░█████████░░░░▄▀░░░░█░░▄▀░░██░░▄▀░░█\n" +
        "█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░░░▄▀░░█████░░▄▀░░███░░▄▀░░██░░▄▀░░████░░▄▀░░░░░░▄▀░░███░░▄▀░░█████████░░░░▄▀░░░░█████████░░░░▄▀░░░░███░░▄▀░░░░░░▄▀░░█\n" +
        "█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀░░█████░░▄▀░░███░░▄▀░░██░░▄▀░░████░░▄▀▄▀▄▀▄▀▄▀░░███░░▄▀░░███████░░░░▄▀░░░░█████████░░░░▄▀░░░░█████░░▄▀▄▀▄▀▄▀▄▀░░█\n" +
        "█░░▄▀░░██░░░░░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░▄▀░░░░█████░░▄▀░░███░░▄▀░░██░░▄▀░░████░░▄▀░░░░░░░░░░███░░▄▀░░█████░░░░▄▀░░░░█████████░░░░▄▀░░░░███████░░▄▀░░░░░░▄▀░░█\n" +
        "█░░▄▀░░██████████░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░███████░░▄▀░░███░░▄▀░░██░░▄▀░░████░░▄▀░░███████████░░▄▀░░███░░░░▄▀░░░░█████████░░░░▄▀░░░░█████████░░▄▀░░██░░▄▀░░█\n" +
        "█░░▄▀░░██████████░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░░░░░█░░░░▄▀░░░░█░░▄▀░░░░░░▄▀░░████░░▄▀░░█████████░░░░▄▀░░░░█░░▄▀▄▀░░░░░░░░░░░░█░░▄▀▄▀░░░░░░░░░░░░█░░▄▀░░██░░▄▀░░█\n" +
        "█░░▄▀░░██████████░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀▄▀▄▀░░█░░▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░████░░▄▀░░█████████░░▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█\n" +
        "█░░░░░░██████████░░░░░░█░░░░░░██░░░░░░█░░░░░░██░░░░░░░░░░█░░░░░░░░░░█░░░░░░░░░░░░░░████░░░░░░█████████░░░░░░░░░░█░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░█░░░░░░██░░░░░░█\n" +
        "██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\n" +
                "Press 1 --> Menu Card\n" +
                "Press 2 --> Start new Order\n" +
                "Press 3 --> All active Orders\n" +
                "Press 4 --> Finalize an order\n" +
                "Press 5 --> Sale revenue\n" +
                "Press 6 --> Pizza statistic in percentage\n" + "\n" +
                "Extra Added Functionality\n" +
                "Press 7 --> Display the current time & date\n" +
                "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////"+"\n");
    }

    /**
     * @author Younes Karim & Ruimin Huang
     * // input for the welcome page
     **/
    public static void start(Scanner input, ArrayList<Menu> pizza, ArrayList<Pizza> customer,ArrayList<String> stats) throws IOException {
        while (true) {
            //show the main page
            Menu.startPage();
            //scanner
            int num = input.nextInt();
            //String text = input.nextLine();
            switch (num) {
                case 1:
                    // open the menu view of all the pizzas
                    getMenu(pizza);
                    break;
                case 2:
                    // order a pizza with attributes name,pizzaNr, (location).
                    Pizza.createPizza(customer);
                    break;
                case 3:
                    // See all current orders
                    Pizza.pizzaOrders(customer,pizza);
                    break;
                case 4:
                    // Finish a order
                    Order.pizzaFinisher(customer,pizza,stats);
                    break;
                case 5:
                    // view all the sale of all pizzas
                    Count.countTheMoney();
                    break;
                case 6:
                    // pizza statistic
                    Count.countTheStats(stats);
                    break;
                case 7:
                    // Test
                    System.out.println("Current time and date: "+Count.getdate()+"\n");
                    break;
                default:
                    System.out.println("...Shutting down...");
                    return;
            }
        }
    }

    /**
     * @author Younes Karim & Benmessaoud Nadia & Ruimin Huang
     * // display all the pizzas for Mario
     **/
    public static void getMenu(ArrayList<Menu> showMenu) {
        for (int i = 0; i < showMenu.size(); ++i) {
            if (i < 9) {
                System.out.println("" + showMenu.get(i).getPizzaNr() + ".  " +
                        "Pizza: " + showMenu.get(i).getPizzaName() + ": " +
                        showMenu.get(i).getPizzaFilling() + "....." + showMenu.get(i).getPizzaPrice() + ",-");
            } else {
                System.out.println("" + showMenu.get(i).getPizzaNr() + ". " +
                        "Pizza:  " + showMenu.get(i).getPizzaName() + ": " +
                        showMenu.get(i).getPizzaFilling() + "....." + showMenu.get(i).getPizzaPrice() + ",-");
            }
        }
        System.out.println("\nThe Menu is ready for you Mario ;)\n\n");
    }

    public int getPizzaNr() {
        return pizzaNr;
    }
    public String getPizzaName() {
        return pizzaName;
    }
    public String getPizzaFilling() {
        return pizzaFilling;
    }
    public int getPizzaPrice() {
        return pizzaPrice;
    }
    public void setPizzaNr(int pizzaNr) {
        this.pizzaNr = pizzaNr;
    }
    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }
    public void setPizzaFilling(String pizzaFilling) {
        this.pizzaFilling = pizzaFilling;
    }
    public void setPizzaPrice(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }
}