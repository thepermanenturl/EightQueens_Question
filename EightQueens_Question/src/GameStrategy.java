public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		return cellId%8;
		//return 0;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		return cellId/8;
		//return 0;	// just for the heck of it
	}
	
	private int modq(int n)
	{
		if(n<0)
			return n+8;
		return n;
	}
	
	private int modq2(int n)
	{
		if(n<0)
			return n+7;
		return n;
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................

		*/
		
		for(int i=0;i<8;i++)
			if(placedQueens[i][col]==true)
				return false;
		
		
		for(int i=0;i<8;i++)
			if(placedQueens[row][i]==true)
				return false;
		
		for(int p=0;p<8;p++)
	        for(int q=0;q<8;q++)
	            if((placedQueens[p][q] == true ) && ((p+q == row+col) || (p-q == row-col)))
	                isValid = false;

		
		placedQueens[row][col]=true;
		numQueens++;
		return isValid;
	}
}














