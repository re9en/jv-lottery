package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final Random RANDOM = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = RANDOM.nextInt(100);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }

}
