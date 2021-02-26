package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;
import static utils.StringUtils.appendNewLine;

public class Board {
    private static int BOARD_SIZE = 8;
    private List<Rank> board = new ArrayList<>(BOARD_SIZE);
    private List<Piece> whitePawns = new ArrayList<>(BOARD_SIZE);
    private List<Piece> whiteOthers = new ArrayList<>(BOARD_SIZE);
    private List<Piece> blackPawns = new ArrayList<>(BOARD_SIZE);
    private List<Piece> blackOthers = new ArrayList<>(BOARD_SIZE);

    public void addPiece(Piece piece, int rankNum, int fileNum) {
        Rank rankToPutIn = board.get(BOARD_SIZE - rankNum);
        rankToPutIn.rank.add(fileNum - 1, piece);
    }

    public void addWhitePawn(Piece piece) {
        if (piece.getType().equals(Piece.Type.PAWN) && piece.getColor().equals(Piece.Color.WHITE)) {
            whitePawns.add(piece);
        }
    }

    public void addWhiteOther(Piece piece) {
        if (!piece.getType().equals(Piece.Type.PAWN) && piece.getColor().equals(Piece.Color.WHITE)) {
            whiteOthers.add(piece);
        }
    }

    public void addBlackPawn(Piece piece) {
        if (piece.getType().equals(Piece.Type.PAWN) && piece.getColor().equals(Piece.Color.BLACK)) {
            blackPawns.add(piece);
        }
    }

    public void addBlackOther(Piece piece) {
        if (!piece.getType().equals(Piece.Type.PAWN) && piece.getColor().equals(Piece.Color.BLACK)) {
            blackOthers.add(piece);
        }
    }

    public Piece findWhitePawn(int index) {
        return whitePawns.get(index);
    }

    public Piece findBlackPawn(int index) {
        return blackPawns.get(index);
    }

    public void initialize() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            addWhitePawn(Piece.createWhitePawn());
            addBlackPawn(Piece.createBlackPawn());
        }
        addWhiteOther(Piece.createWhiteRook()); // whites
        addWhiteOther(Piece.createWhiteKnight());
        addWhiteOther(Piece.createWhiteBishop());
        addWhiteOther(Piece.createWhiteQueen());
        addWhiteOther(Piece.createWhiteKing());
        addWhiteOther(Piece.createWhiteBishop());
        addWhiteOther(Piece.createWhiteKnight());
        addWhiteOther(Piece.createWhiteRook());
        addBlackOther(Piece.createBlackRook()); // blacks
        addBlackOther(Piece.createBlackKnight());
        addBlackOther(Piece.createBlackBishop());
        addBlackOther(Piece.createBlackQueen());
        addBlackOther(Piece.createBlackKing());
        addBlackOther(Piece.createBlackBishop());
        addBlackOther(Piece.createBlackKnight());
        addBlackOther(Piece.createBlackRook());
    }

    public String makeBoard() {
        StringBuilder sb = new StringBuilder();
        String blankRank = "........";
        sb.append(appendNewLine(getBlackOthersResult()));
        sb.append(appendNewLine(getBlackPawnsResult()));
        sb.append(appendNewLine(blankRank));
        sb.append(appendNewLine(blankRank));
        sb.append(appendNewLine(blankRank));
        sb.append(appendNewLine(blankRank));
        sb.append(appendNewLine(getWhitePawnsResult()));
        sb.append(appendNewLine(getWhiteOthersResult()));
        return sb.toString();
    }

    public int pieceCount() {
        return whitePawns.size() + blackPawns.size() + whiteOthers.size() + blackOthers.size();
    }

    public int getWhitePawnsSize() {
        return whitePawns.size();
    }

    public int getBlackPawnsSize() {
        return blackPawns.size();
    }

    public String getWhitePawnsResult() {
        return getWhitesResult(whitePawns);
    }

    public String getWhiteOthersResult() {
        return getWhitesResult(whiteOthers);
    }

    public String getBlackPawnsResult() {
        return getBlacksResult(blackPawns);
    }

    public String getBlackOthersResult() {
        return getBlacksResult(blackOthers);
    }

    private String getWhitesResult(List<Piece> pieces) {
        StringBuilder sb = new StringBuilder();
        for (Piece aPiece : pieces) {
            sb.append(aPiece.getType().getWhiteSymbol());
        }
        return sb.toString();
    }
    private String getBlacksResult(List<Piece> pieces) {
        StringBuilder sb = new StringBuilder();
        for (Piece aPiece : pieces) {
            sb.append(aPiece.getType().getBlackSymbol());
        }
        return sb.toString();
    }
}
