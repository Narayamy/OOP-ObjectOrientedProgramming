package Question3;

public class ChessPieceTest {

	public static void main(String[] args) {
		
		// Creating chess pieces
		ChessPiece piece1;
		ChessPiece piece2;
		ChessPiece piece3;
		ChessPiece piece4;
		ChessPiece piece5;
		ChessPiece piece6;
		ChessPiece piece7;
		ChessPiece piece8;
		ChessPiece piece9;
		ChessPiece piece10;
		
		// give them a value
		piece1 = ChessPiece.BISHOP;
		piece2 = ChessPiece.KING;
		piece3 = ChessPiece.KNIGHT;
		piece4 = ChessPiece.PAWN;
		piece5 = ChessPiece.QUEEN;
		piece6 = ChessPiece.ROOK;
		piece7 = ChessPiece.PAWN;
		piece8 = ChessPiece.KNIGHT;
		piece9 = ChessPiece.BISHOP;
		piece10 = ChessPiece.ROOK;
		
		// comparing the pieces for equality and order
		if(piece1.compareTo(piece2) == 0) {
			System.out.println(piece1 + " is equal to " + piece2);
		}
		else {
			System.out.println(piece1 + " is not equal to " + piece2);
			if(piece1.compareTo(piece2) < 0) {
				System.out.println(piece1 + " is smaller than " + piece2);
			}
			if(piece1.compareTo(piece2) > 0) {
				System.out.println(piece1 + " is greater than " + piece2);				
			}
		}
		
		System.out.println("#######################");
		if(piece2.compareTo(piece3) == 0) {
			System.out.println(piece2 + " is equal to " + piece3);
		}
		else {
			System.out.println(piece2 + " is not equal to " + piece3);
			if(piece2.compareTo(piece3) < 0) {
				System.out.println(piece2 + " is smaller than " + piece3);
			}
			if(piece2.compareTo(piece3) > 0) {
				System.out.println(piece2 + " is greater than " + piece3);				
			}
		}
		
		System.out.println("#######################");
		if(piece3.compareTo(piece4) == 0) {
			System.out.println(piece3 + " is equal to " + piece4);
		}
		else {
			System.out.println(piece3 + " is notequal to " + piece4);
			if(piece3.compareTo(piece4) < 0) {
				System.out.println(piece3 + " is smaller than " + piece4);
			}
			if(piece3.compareTo(piece4) > 0) {
				System.out.println(piece3 + " is greater than " + piece4);				
			}
		}
		
		System.out.println("#######################");
		if(piece4.compareTo(piece5) == 0) {
			System.out.println(piece4 + " is equal to " + piece5);
		}
		else {
			System.out.println(piece4 + " is not equal to " + piece5);
			if(piece4.compareTo(piece5) < 0) {
				System.out.println(piece4 + " is smaller than " + piece5);
			}
			if(piece4.compareTo(piece5) > 0) {
				System.out.println(piece4 + " is greater than " + piece5);				
			}
		}
		
		System.out.println("#######################");
		if(piece5.compareTo(piece6) == 0) {
			System.out.println(piece5 + " is equal to " + piece6);
		}
		else {
			System.out.println(piece5 + " is not equal to " + piece6);
			if(piece5.compareTo(piece6) < 0) {
				System.out.println(piece5 + " is smaller than " + piece6);
			}
			if(piece5.compareTo(piece6) > 0) {
				System.out.println(piece5 + " is greater than " + piece6);				
			}
		}
		
		System.out.println("#######################");
		if(piece6.compareTo(piece7) == 0) {
			System.out.println(piece6 + " is equal to " + piece7);
		}
		else {
			System.out.println(piece6 + " is not equal to " + piece7);
			if(piece6.compareTo(piece7) < 0) {
				System.out.println(piece6 + " is smaller than " + piece7);
			}
			if(piece6.compareTo(piece7) > 0) {
				System.out.println(piece6 + " is greater than " + piece7);				
			}
		}
		
		System.out.println("#######################");
		if(piece7.compareTo(piece8) == 0) {
			System.out.println(piece7 + " is equal to " + piece8);
		}
		else {
			System.out.println(piece7 + " is not equal to " + piece8);
			if(piece7.compareTo(piece8) < 0) {
				System.out.println(piece7 + " is smaller than " + piece8);
			}
			if(piece7.compareTo(piece8) > 0) {
				System.out.println(piece7 + " is greater than " + piece8);				
			}
		}
		
		System.out.println("#######################");
		if(piece8.compareTo(piece9) == 0) {
			System.out.println(piece8 + " is equal to " + piece9);
		}
		else {
			System.out.println(piece8 + " is equal to " + piece9);
			if(piece8.compareTo(piece9) < 0) {
				System.out.println(piece8 + " is smaller than " + piece9);
			}
			if(piece8.compareTo(piece9) > 0) {
				System.out.println(piece8 + " is greater than " + piece9);				
			}
		}
		
		System.out.println("#######################");
		if(piece9.compareTo(piece10) == 0) {
			System.out.println(piece9 + " is equal to " + piece10);
		}
		else {
			System.out.println(piece9 + " is not equal to " + piece10);
			if(piece9.compareTo(piece10) < 0) {
				System.out.println(piece9 + " is smaller than " + piece10);
			}
			if(piece9.compareTo(piece10) > 0) {
				System.out.println(piece9 + " is greater than " + piece10);				
			}
		}
		
		// should be equal
		System.out.println("#######################");
		if(piece1.compareTo(piece9) == 0) {
			System.out.println(piece1 + " is equal to " + piece9);
		}
		else {
			System.out.println(piece1 + " is not equal to " + piece9);
		}
		
		// should be equal
		System.out.println("#######################");
		if(piece6.compareTo(piece10) == 0) {
			System.out.println(piece6 + " is equal to " + piece10);
		}
		else {
			System.out.println(piece6 + " is not equal to " + piece10);
		}
		
		// should be equal
		System.out.println("#######################");
		if(piece3.compareTo(piece8) == 0) {
			System.out.println(piece3 + " is equal to " + piece8);
		}
		else {
			System.out.println(piece3 + " is not equal to " + piece8);
		}
		
		// should be equal
		System.out.println("#######################");
		if(piece4.compareTo(piece7) == 0) {
			System.out.println(piece4 + " is equal to " + piece7);
		}
		else {
			System.out.println(piece4 + " is not equal to " + piece7);
		}
		
	}

}
