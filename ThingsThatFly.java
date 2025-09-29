import java.util.ArrayList;

public class ThingsThatFly {

    public static void main(String[] args) {
        ArrayList<Flight> fly = new ArrayList<>();

        fly.add(new Airplane("Boeing 747", 2016));
        fly.add(new Bird("Eagle"));
        fly.add(new Bird("Hummingbird"));

        for (Flight flies : fly){
            System.out.println(flies.toString());
            flies.fly();
        }
    }
}