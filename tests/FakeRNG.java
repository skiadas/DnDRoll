public class FakeRNG implements RNG {
    private int current = -1;
    private final Integer[] rolls;

    public FakeRNG(Integer... rolls) {
        this.rolls = rolls;
    }

    public int rollOnce(int sides) {
        current += 1;
        return rolls[current];
    }
}
