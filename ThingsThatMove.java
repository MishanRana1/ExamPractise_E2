import java.util.ArrayList;

public class ThingsThatMove {
    public static void main(String[] args) {
        ArrayList<Movement> moves = new ArrayList<>();

        moves.add(new Airplane("Boeing 747", 2016));
        moves.add(new Bird("Eagle"));
        moves.add(new Bird("Hummingbird"));

        for (Movement m : moves){
            System.out.println(m.toString());
            m.fly();
            m.walk();
            m.jump();
        }
    }
}
