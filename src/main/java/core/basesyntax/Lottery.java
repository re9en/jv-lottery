package core.basesyntax;

import java.util.Random;

public class Lottery {
    int MAX = 100;
    private static final Random RANDOM = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        int randomNumber = RANDOM.nextInt(MAX) + 1;
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
