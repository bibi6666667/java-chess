package pieces;

public class Pawn {
    public final static String WHITE = "white";
    public final static String BLACK = "black";
    public final static String WHITE_REPRESENTATION = "p";
    public final static String BLACK_REPRESENTATION = "P";
    private final String representation;
    private final String color;

    public Pawn() {
        this(WHITE, WHITE_REPRESENTATION);
    }

    public Pawn(String color, String representation) {
        this.color = color;
        this.representation = representation;
    }

    public String getColor() {
        return color;
    }

    public String getRepresentation() {
        return representation;
    }
}
