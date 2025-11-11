package core.basesyntax;

public class Ball {
    private final Color color;
    private final int number;

    public Ball(Color color,int number) {
        this.color = color;
        this.number = number;
    }

    public Color getColors() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return ("Color: " + getColors() + ", " + "Number " + getNumber());
    }
}
