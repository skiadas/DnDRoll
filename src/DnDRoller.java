public class DnDRoller {
    private final int dice;
    private final int sides;
    private RNG rng = new TrueRNG();

    public DnDRoller(int dice, int sides) {
        this.dice = dice;
        this.sides = sides;
    }

    void setRng(RNG rng) {
        this.rng = rng;
    }

    int roll() {
        int sum = 0;
        for (int i = 0; i < dice; i++) {
            sum += rng.rollOnce(sides);
        }
        return sum;
    }

}
