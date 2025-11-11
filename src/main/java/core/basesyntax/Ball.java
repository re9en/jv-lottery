package core.basesyntax;

public class Ball {
    private final Colors colors;
    private final int number;

    public Ball(Colors colors,int number) {
        this.colors = colors;
        this.number = number;
    }

    public Colors getColors() {
        return colors;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return ("Color: " + getColors() + " " + "Number " + getNumber());
    }
}
