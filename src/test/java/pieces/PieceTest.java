package pieces;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

public class PieceTest {

    @Test
    @DisplayName("흰색, 검은색 폰 생성")
    void createPawn() {
        verifyPiece(Piece.createWhitePawn(), Piece.Color.WHITE, Piece.Type.PAWN);
        verifyPiece(Piece.createBlackPawn(), Piece.Color.BLACK, Piece.Type.PAWN);
    }

    @Test
    @DisplayName("흰색, 검은색 나이트 생성")
    void createKnight() {
        verifyPiece(Piece.createWhiteKnight(), Piece.Color.WHITE, Piece.Type.KNIGHT);
        verifyPiece(Piece.createBlackKnight(), Piece.Color.BLACK, Piece.Type.KNIGHT);
    }

    @Test
    @DisplayName("흰색, 검은색 룩 생성")
    void createRook() {
        verifyPiece(Piece.createWhiteRook(), Piece.Color.WHITE, Piece.Type.ROOK);
        verifyPiece(Piece.createBlackRook(), Piece.Color.BLACK, Piece.Type.ROOK);
    }

    @Test
    @DisplayName("흰색, 검은색 비숍 생성")
    void createBishop() {
        verifyPiece(Piece.createWhiteBishop(), Piece.Color.WHITE, Piece.Type.BISHOP);
        verifyPiece(Piece.createBlackBishop(), Piece.Color.BLACK, Piece.Type.BISHOP);
    }

    @Test
    @DisplayName("흰색, 검은색 퀸 생성")
    void createQueen() {
        verifyPiece(Piece.createWhiteQueen(), Piece.Color.WHITE, Piece.Type.QUEEN);
        verifyPiece(Piece.createBlackQueen(), Piece.Color.BLACK, Piece.Type.QUEEN);
    }

    @Test
    @DisplayName("흰색, 검은색 킹 생성")
    void createKing() {
        verifyPiece(Piece.createWhiteKing(), Piece.Color.WHITE, Piece.Type.KING);
        verifyPiece(Piece.createBlackKing(), Piece.Color.BLACK, Piece.Type.KING);
    }

    private void verifyPiece(final Piece piece, final Piece.Color color, final Piece.Type type){
        assertThat(piece.getColor()).isEqualTo(color);
        assertThat(piece.getType()).isEqualTo(type);
    }

    @Test
    @DisplayName("흰색, 검은색 말 구분")
    void isBlackOrWhite() {
        Piece whitePiece = Piece.createWhitePawn();
        Piece blackPiece = Piece.createBlackPawn();
        assertThat(whitePiece.isWhite()).isEqualTo(true);
        assertThat(blackPiece.isBlack()).isEqualTo(true);
        assertThat(whitePiece.isBlack()).isEqualTo(false);
        assertThat(blackPiece.isWhite()).isEqualTo(false);
    }

    @Test
    @DisplayName("기물에 맞는 기호를 가져오기")
    public void getSymbolPerPiece() {
        assertThat(Piece.Type.PAWN.getWhiteSymbol()).isEqualTo('p');
        assertThat(Piece.Type.PAWN.getBlackSymbol()).isEqualTo('P');
    }

}
