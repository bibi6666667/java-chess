package pieces;

public class Piece {
    public enum Color {
        WHITE("white"), BLACK("black"), NO_COLOR("");

        private final String color;

        Color(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }
    }

    public enum Type {
        PAWN('p'), ROOK('r'), KNIGHT('n'), BISHOP('b'),
        QUEEN('q'), KING('k'), NO_PIECE('.');

        private final char symbol;

        Type(char symbol) {
            this.symbol = symbol;
        }

        public char getWhiteSymbol() {
            return symbol;
        }

        public char getBlackSymbol() {
            return Character.toUpperCase(symbol);
        }
    }

    private final Type type;
    private final Color color;

    private Piece(Type type, Color color) {
        this.type = type;
        this.color = color;
    }

    boolean isWhite() {
        return color.equals(Color.WHITE);
    }

    boolean isBlack() {
        return color.equals(Color.BLACK);
    }

    public static Piece createWhitePawn() {
        return createWhite(Type.PAWN);
    }

    public static Piece createBlackPawn() {
        return createBlack(Type.PAWN);
    }

    public static Piece createWhiteKnight() {
        return createWhite(Type.KNIGHT);
    }

    public static Piece createBlackKnight() {
        return createBlack(Type.KNIGHT);
    }

    public static Piece createWhiteRook() {
        return createWhite(Type.ROOK);
    }

    public static Piece createBlackRook() {
        return createBlack(Type.ROOK);
    }

    public static Piece createWhiteBishop() {
        return createWhite(Type.BISHOP);
    }

    public static Piece createBlackBishop() {
        return createBlack(Type.BISHOP);
    }

    public static Piece createWhiteQueen() {
        return createWhite(Type.QUEEN);
    }

    public static Piece createBlackQueen() {
        return createBlack(Type.QUEEN);
    }

    public static Piece createWhiteKing() {
        return createWhite(Type.KING);
    }

    public static Piece createBlackKing() {
        return createBlack(Type.KING);
    }

    public static Piece createBlank() {
        return new Piece(Type.NO_PIECE, Color.NO_COLOR);
    }

    private static Piece createWhite(Type type) {
        return new Piece(type, Color.WHITE);
    }

    private static Piece createBlack(Type type) {
        return new Piece(type, Color.BLACK);
    }

    public Type getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

}
