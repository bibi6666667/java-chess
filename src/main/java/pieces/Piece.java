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
    public static final String WHITE = "white";
    public static final String BLACK = "black";

    public static final String PAWN = "pawn";
    public static final String KNIGHT = "knight";
    public static final String ROOK = "rook";
    public static final String BISHOP = "bishop";
    public static final String QUEEN = "queen";
    public static final String KING = "king";

    public static final char WHITE_PAWN_SYMBOL = 'p';
    public static final char WHITE_KNIGHT_SYMBOL = 'n';
    public static final char WHITE_ROOK_SYMBOL = 'r';
    public static final char WHITE_BISHOP_SYMBOL = 'b';
    public static final char WHITE_QUEEN_SYMBOL = 'q';
    public static final char WHITE_KING_SYMBOL = 'k';
    public static final char BLACK_PAWN_SYMBOL = 'P';
    public static final char BLACK_KNIGHT_SYMBOL = 'N';
    public static final char BLACK_ROOK_SYMBOL = 'R';
    public static final char BLACK_BISHOP_SYMBOL = 'B';
    public static final char BLACK_QUEEN_SYMBOL = 'Q';
    public static final char BLACK_KING_SYMBOL = 'K';

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
        return new Piece(Type.PAWN, Color.WHITE);
    }

    public static Piece createBlackPawn() {
        return new Piece(Type.PAWN, Color.BLACK);
    }

    public static Piece createWhiteKnight() {
        return new Piece(Type.KNIGHT, Color.WHITE);
    }

    public static Piece createBlackKnight() {
        return new Piece(Type.KNIGHT, Color.BLACK);
    }

    public static Piece createWhiteRook() {
        return new Piece(Type.ROOK, Color.WHITE);
    }

    public static Piece createBlackRook() {
        return new Piece(Type.ROOK, Color.BLACK);
    }

    public static Piece createWhiteBishop() {
        return new Piece(Type.BISHOP, Color.WHITE);
    }

    public static Piece createBlackBishop() {
        return new Piece(Type.BISHOP, Color.BLACK);
    }

    public static Piece createWhiteQueen() {
        return new Piece(Type.QUEEN, Color.WHITE);
    }

    public static Piece createBlackQueen() {
        return new Piece(Type.QUEEN, Color.BLACK);
    }

    public static Piece createWhiteKing() {
        return new Piece(Type.KING, Color.WHITE);
    }

    public static Piece createBlackKing() {
        return new Piece(Type.KING, Color.BLACK);
    }

    public static Piece createBlank() {
        return new Piece(Type.NO_PIECE, Color.NO_COLOR);
    }

    public Type getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

}
