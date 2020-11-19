import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class Count {
    /**
     * @author Younes Karim
     * // count the sale revenue from file
     **/
    public static void countTheMoney() throws FileNotFoundException {
        Files.calculateSale();
        if (!Files.empty){
            System.out.println("The Total sale revenue for all pizzas sold is: \n" + Files.getPizzaSale() + "kr.\n");
        } else {
            System.out.println("System Error! [4] - "+Main.File2+" is empty!\nAka the Array is also empty! Try placing an order first\n");
        }
    }

    /**
     * @author Younes Karim
     * // Calculate the statistics for every pizza sold in percentage, read from the file PizzaStats.txt
     * // super hardcoded but it was added last minute so that's how it is for now
     **/
    public static void countTheStats(ArrayList<String> stats) throws FileNotFoundException {
        String sold = " Sale equals to -----";
        Files.pizzaList(stats);
        if (!Files.empty){
            System.out.println("//// The most sold pizza in percentage ////\n");
            double a1 = Collections.frequency(stats, " Vesuvio ");
            System.out.println("1: Vesuvio:" + sold +"------> "+ roundDown((a1 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, " Vesuvio "));
            double a2 = Collections.frequency(stats, " Amerikaner ");
            System.out.println("2: Amerikaner:" + sold +"---> "+ roundDown((a2 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, " Amerikaner "));
            double a3 = Collections.frequency(stats, " Caccoatore ");
            System.out.println("3: Caccoatore:" + sold +"---> "+ roundDown((a3 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, " Caccoatore "));
            double a4 = Collections.frequency(stats, " Carbona ");
            System.out.println("4: Carbona:" + sold +"------> "+ roundDown((a4 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, " Carbona "));
            double a5 = Collections.frequency(stats, " Dennis ");
            System.out.println("5: Dennis:" + sold +"-------> "+ roundDown((a5 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, " Dennis "));
            double a6 = Collections.frequency(stats, " Bertil ");
            System.out.println("6: Bertil:" + sold +"-------> "+ roundDown((a6 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, " Bertil "));
            double a7 = Collections.frequency(stats, " Silvia ");
            System.out.println("7: Silvia:" + sold +"-------> "+ roundDown((a7 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, " Silvia "));
            double a8 = Collections.frequency(stats, " Victoria ");
            System.out.println("8: Victoria:" + sold +"-----> "+ roundDown((a8 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, " Victoria "));
            double a9 = Collections.frequency(stats, " Toronfo ");
            System.out.println("9: Toronfo:" + sold +"------> "+ roundDown((a9 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, " Toronfo "));
            double a10 = Collections.frequency(stats, "Capricciosa ");
            System.out.println("10: Capricciosa:" + sold +"-> "+ roundDown((a10 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, "Capricciosa "));
            double a11 = Collections.frequency(stats, "Hawaii ");
            System.out.println("11: Hawaii:" + sold +"------> "+ roundDown((a11 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, "Hawaii "));
            double a12 = Collections.frequency(stats, "Le Blissola ");
            System.out.println("12: Le Blissola:" + sold +"-> "+ roundDown((a12 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, "Le Blissola "));
            double a13 = Collections.frequency(stats, "Venezia ");
            System.out.println("13: Venezia:" + sold +"-----> "+ roundDown((a13 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, "Venezia "));
            double a14 = Collections.frequency(stats, "Mafia ");
            System.out.println("14: Mafia:" + sold +"-------> "+ roundDown((a14 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, "Mafia "));
            double a15 = Collections.frequency(stats, "Mario ");
            System.out.println("15: Mario:" + sold +"-------> "+ roundDown((a15 / stats.size()) * 100) + "% and the amount is: "+ Collections.frequency(stats, "Mario "));
            System.out.println("\nThe total amount of sold pizzas is: "+stats.size() +"\n");
        } else {
            System.out.println("System Error! [4] - "+Main.File3+" is empty!\nAka the Array is also empty! Try placing an order first\n");
        }
        /*
        System.out.println("Vesuvio: "+ Collections.frequency(stats, " Vesuvio "));
        System.out.println("Amerikaner: "+ Collections.frequency(stats, " Amerikaner "));
        System.out.println("Caccoatore: "+ Collections.frequency(stats, " Caccoatore "));
        System.out.println("Carbona: "+ Collections.frequency(stats, " Dennis "));
        System.out.println("Dennis: "+ Collections.frequency(stats, " Bertil "));
        System.out.println("Bertil: "+ Collections.frequency(stats, " Silvia "));
        System.out.println("Silvia: "+ Collections.frequency(stats, " Victoria "));
        System.out.println("Victoria: "+ Collections.frequency(stats, " Toronfo "));
        System.out.println("Toronfo: "+ Collections.frequency(stats, "Capricciosa "));
        System.out.println("Capricciosa: "+ Collections.frequency(stats, " Carbona "));
        System.out.println("Hawaii: "+ Collections.frequency(stats, "Hawaii "));
        System.out.println("Le Blissola: "+ Collections.frequency(stats, "Le Blissola "));
        System.out.println("Venezia: "+ Collections.frequency(stats, "Venezia "));
        System.out.println("Mafia: "+ Collections.frequency(stats, "Mafia "));
        System.out.println("Mario: "+ Collections.frequency(stats, "Mario "));
        */
    }

    /**
     * @author phuclv @Stackoverflow
     * // function that allows us to input a double and round it down into a two digit number
     **/
    static double roundDown(double unroundedNumber){
        int truncatedNumberInt = (int)( unroundedNumber * Math.pow( 10, 2) );
        return truncatedNumberInt / Math.pow( 10, 2);
    }

    /**
     * @author Younes Karim
     * // Get the current date and time
     **/
    public static String getdate() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yy @ HH:mm");
        return date.format(format);
    }
}
