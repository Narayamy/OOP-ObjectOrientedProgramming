
package Question3;

public enum ChessPiece {PAWN, KNIGHT, BISHOP, KING, ROOK, QUEEN;

	// toString to print as they are
	public String toString() {
		switch(this) {
		case PAWN: return "Pawn";
		case KNIGHT: return "Knight";
		case BISHOP: return "Bishop";
		case KING: return "King";
		case ROOK: return "Rook";
		default: return "Queen";
		}
	}
	
	// value method to return their value
	public int value() {
		switch(this) {
		case PAWN: return 1;
		case KNIGHT: return 3;
		case BISHOP: return 3;
		case KING: return 4;
		case ROOK: return 5;
		default: return 9;
		}
	}
}
	
