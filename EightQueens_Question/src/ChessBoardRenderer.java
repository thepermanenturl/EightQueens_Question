public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		
		if((((square/8)%2)+square)%2==1)
			return true;
		return false;
	}
}
