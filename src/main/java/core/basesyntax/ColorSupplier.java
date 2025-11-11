package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomIndex = new Random().nextInt(Colors.values().length);
        Colors colors = Colors.values()[randomIndex];
        return colors.toString();
    }
}
