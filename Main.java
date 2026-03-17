import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rest> restaurants = new ArrayList<>();

        try {
            scanRestaurantFile(restaurants);
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        };
        printRandRest(restaurants);
    }

    public static void scanRestaurantFile(ArrayList<Rest> list) throws FileNotFoundException{
        File file = new File( "src/restaurant1.txt");
        Scanner scan = new Scanner(file);
        scan.useDelimiter( ",");
        scan.useLocale(Locale.US);


        while (scan.hasNext()) {

            String name = scan.next();
            int waitTime = scan.nextInt();
            double rating = scan.nextDouble();
            double avgPrice = scan.nextDouble();
            double distance = scan.nextDouble();
            String hoursOpen = scan.next();

            if (rating > 5) {
                rating =-1;
            }

            Rest restaurant = new Rest(name, waitTime, rating, avgPrice, distance, hoursOpen);
            list.add(restaurant);
        }

    }

    /** Chose a random restaurant from array list
     * *
     * @param list
     */

    public static void printRandRest(ArrayList <Rest> list ){
        ArrayList<Rest> restaurants = new ArrayList<>();
        Random randy = new Random();
        int numRestaurants = list.size();
        int randIndex = randy.nextInt(numRestaurants);
        System.out.println(list.get(randIndex));

    }

}

