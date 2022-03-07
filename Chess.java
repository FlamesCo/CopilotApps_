public class ChessTestv0 {
    public static void main(String[] args) {
        ChessTestv0 chessTest = new ChessTestv0();
        chessTest.run();
    }
// add support for mac os x 
    public void run() {
        Chess chess = new Chess();
        chess.play();
    }
}
    public void run()
    {
        // create the board
        Board board = new Board();
        // create the pieces
        King king = new King(board, "white");
        Queen queen = new Queen(board, "white");
        Rook rook = new Rook(board, "white");
        Bishop bishop = new Bishop(board, "white");
        Knight knight = new Knight(board, "white");
        Pawn pawn = new Pawn(board, "white");
        // run the tests
        testKing(king);
        testQueen(queen);
        testRook(rook);
        testBishop(bishop);
        testKnight(knight);
        testPawn(pawn);
    }