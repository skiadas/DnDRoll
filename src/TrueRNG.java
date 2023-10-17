import java.util.Random;

public class TrueRNG implements RNG {
    private final Random rnd = new Random();

    public int rollOnce(int sides) {
        return rnd.nextInt(sides) + 1;
    }
}