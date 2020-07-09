public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		// System.out.println(square);
		if(square%16>=8) {
			if(square%2==0)
				return true;
		}
		else {
			if(square%2==1)
				return true;
		}
		return false;
	}
}
