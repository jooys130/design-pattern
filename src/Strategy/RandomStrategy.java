package Strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {
    private Random random;

    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    public void study(boolean win) {
        // 순서 없이 다음 손을 내민다
    }

    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }
}
