public class RobotOnMoon {
	 
	public int longestSafeCommand(String[] board) {

		int x =0 , y = 0;
		for (int i = 0 ; i < board.length ; i++)
			for (int j = 0; j < board[0].length(); j++) {
				if(board[i].charAt(j) == 'S')
				{
					x=i;y=j;
				}
			}

		boolean foundObstacle = false;
		for (int i = 0; i < board.length; i++) {
			foundObstacle |= board[i].charAt(y) == '#';
		}
		foundObstacle |= board[x].indexOf('#') >= 0;
		if(foundObstacle) return -1;

		return board[x].length() + board.length-2;
	}
}
